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
    @Column(name = "id")
    private long id;
   @Column(name = "transaction_date")
    private String transaction_date;
    @Column(name= "description")
    private String description;
    @Column(name= "amount")
    private double amount;
    @Column(name = "runningBalance")
    private double remainingBalance;
}
