package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private TransactionType transactionType;
    private Long cbuAccount;
    private Double amount;

    public Transaction(){}

    public Transaction(TransactionType transactionType, Long cbuAccount, Double amount) {
        this.transactionType = transactionType;
        this.cbuAccount = cbuAccount;
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public Long getCbuAcount() {
        return cbuAccount;
    }

    public Double getAmount() {
        return amount;
    }
}
