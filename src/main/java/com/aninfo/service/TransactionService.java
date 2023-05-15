package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.model.TransactionType;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction withdraw(Long cbuAccount, Double amount) {
        Transaction withDraw = new Transaction(TransactionType.WITHDRAW, cbuAccount, amount);
        return transactionRepository.save(withDraw);
    }

    public Transaction deposit(Long cbuAccount, Double amount) {
        Transaction deposit = new Transaction(TransactionType.DEPOSIT, cbuAccount, amount);
        return transactionRepository.save(deposit);
    }

    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findTransactionById(id);
    }

    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }

    public Collection<Transaction> getTransactionsByCbuAccount(Long cbuAccount) {
        return transactionRepository.findTransactionsByCbuAccount(cbuAccount);
    }
}
