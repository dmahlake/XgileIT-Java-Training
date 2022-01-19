package com.example.uploadBankStatement.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(schema = "uploadbankstatement", name = "statement")
public class UploadStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "transaction_date")
    private String transactionDate;
    private String description;
    private double amount;
    private double runningBalance;
    private String category;
}
