package com.example.uploadBankStatement.controller;

import com.example.uploadBankStatement.persistence.entity.UploadStatement;
import com.example.uploadBankStatement.service.UploadStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v2")
public class UploadStatementController {

    @Autowired
    UploadStatementService service;

    @PostMapping("/uploadStatement")
    public Object uploadFile(@RequestParam("files") MultipartFile file) throws Exception {

        String message = "";
        if (UploadStatementService.isCSVFormat(file)) {
            try {
                List<UploadStatement> uploadStatements = service.uploadFile(file);
                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(uploadStatements);
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED);
            }
        }

        message = "Please upload a csv file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/getcategories")
    public String display()
    {
       service.assignCategories();
       return "Successfully assigned";
    }

}


