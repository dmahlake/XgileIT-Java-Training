package com.example.uploadBankStatement.controller;

import com.example.uploadBankStatement.service.UploadStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/v2")
public class UploadeStatementController {

    @Autowired
    UploadStatementService service;

    @PostMapping("/uploadStatement")
    public String upload(@RequestParam("files") MultipartFile file)throws Exception
    {
       return service.uploadFile(file);
    }
}
