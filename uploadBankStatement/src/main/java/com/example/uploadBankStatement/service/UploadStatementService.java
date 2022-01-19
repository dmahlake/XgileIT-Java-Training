package com.example.uploadBankStatement.service;

import com.example.uploadBankStatement.persistence.entity.Categories;
import com.example.uploadBankStatement.persistence.entity.UploadStatement;
import com.example.uploadBankStatement.persistence.repository.CategoryRepo;
import com.example.uploadBankStatement.persistence.repository.UploadStatementRepo;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.apache.commons.csv.*;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UploadStatementService {

    public static String fileType = "text/csv";

    @Autowired
    UploadStatementRepo repo;

    @Autowired
    CategoryRepo categoryRepo;

    public static boolean isCSVFormat(MultipartFile file)
    {
        return fileType.equals(file.getContentType()) || Objects.equals(file.getContentType(), "application/vnd.ms-excel");
    }

    @Transactional
    public List<UploadStatement> uploadFile(MultipartFile file)throws Exception
    {
        List<UploadStatement> statements = new ArrayList<>();
        InputStream inputStream = file.getInputStream();
        CsvParserSettings setting = new CsvParserSettings();
        //extracting file header
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);
        setting.setDelimiterDetectionEnabled(true);
        setting.setHeaderExtractionEnabled(true);
        CsvParser csvParser = new CsvParser(setting);
        List<Record> parseAllrecords = csvParser.parseAllRecords(inputStream);

        for (Record record : parseAllrecords) {
            UploadStatement uploadStatement = new UploadStatement();
            uploadStatement.setTransactionDate(record.getString("date"));
            uploadStatement.setDescription(record.getString("description"));
            uploadStatement.setAmount(Double.parseDouble(record.getString("amount")));
            uploadStatement.setRunningBalance(Double.parseDouble(record.getString("current balance")));

            if (!repo.findByAmountAndDescription(uploadStatement.getAmount(), uploadStatement.getDescription(), uploadStatement.getTransactionDate()).isPresent())
                statements.add(uploadStatement);
            csvPrinter.printRecord(record);
        }
        repo.saveAll(statements);
        return statements;
    }

    public List<UploadStatement>allRecord()
    {
        return repo.findAll();
    }

    public void assignCategories()
    {
        List<UploadStatement> statements = repo.findAll();
        List<Categories>categoriesList = categoryRepo.findAll();

        System.out.println(statements);
        System.out.println(categoriesList);

        Map<Long, String> collect = categoriesList.stream().collect(Collectors.toMap(Categories::getId, Categories::getKeyword));
         statements
                .stream()
                .filter(description -> collect.containsValue(description.getDescription()))

                .forEach(category -> category.setCategory(collect.get(category.getId())));
    }

}
