package com.example.uploadBankStatement.other;

import com.example.uploadBankStatement.persistence.entity.UploadStatement;

import java.util.List;

public class ResponseMessage {

    private String message;
    private List<UploadStatement> statements;

    public ResponseMessage(String message, List<UploadStatement> statementList) {
        this.message = message;
        this.statements = statementList;
    }
}
