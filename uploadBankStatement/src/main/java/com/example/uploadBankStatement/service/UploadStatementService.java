package com.example.uploadBankStatement.service;

import com.example.uploadBankStatement.persistence.entity.UploadStatement;
import com.example.uploadBankStatement.persistence.repository.UploadStatementRepo;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UploadStatementService {

    public static String fileType = "text/csv";

    @Autowired
    UploadStatementRepo repo;

    public static boolean isCsvFormat(MultipartFile file)
    {
        return fileType.equals(file.getContentType()) || Objects.equals(file.getContentType(), "application/vnd.ms-excel");
    }

    public String uploadFile(MultipartFile file)throws Exception
    {
        List<UploadStatement> statements = new ArrayList<>();
        InputStream inputStream = file.getInputStream();
        CsvParserSettings setting = new CsvParserSettings();
        //extracting file header
        setting.setDelimiterDetectionEnabled(true);
        setting.setHeaderExtractionEnabled(true);
        CsvParser csvParser = new CsvParser(setting);
        List<Record> parseAllrecords = csvParser.parseAllRecords(inputStream);


        for (Record record : parseAllrecords) {
            UploadStatement uploadStatement = new UploadStatement();
            uploadStatement.setId(Long.parseLong(record.getString("id")));
            uploadStatement.setTransaction_date(record.getString("date"));
            uploadStatement.setDescription(record.getString("description"));
            uploadStatement.setAmount(Double.parseDouble(record.getString("amount")));
            uploadStatement.setRemainingBalance(Double.parseDouble(record.getString("remainingBalance")));

            if (repo.findByAmountAndDescription(uploadStatement.getAmount(), uploadStatement.getDescription(), uploadStatement.getTransaction_date()).equals(uploadStatement))
            {
                return ("record already exist");
            }
            else {
                statements.add(uploadStatement);
            }
        }
        repo.saveAll(statements);
        return "Uploaded successfully...";

    }
}
