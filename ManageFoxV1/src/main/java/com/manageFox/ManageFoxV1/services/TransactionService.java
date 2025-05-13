package com.manageFox.ManageFoxV1.services;

import com.manageFox.ManageFoxV1.model.Transaction;
import com.manageFox.ManageFoxV1.repositories.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Service

public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @CacheEvict(value = "AllTransaction", allEntries = true)
    public Transaction saveTransaction(Transaction transaction) {
        return this.transactionRepository.save(transaction);
    }

    @Cacheable(value = "AllTransaction")
    public List<Transaction> getAllTransaction() {
        return this.transactionRepository.findAll();
    }

    @CacheEvict(value = "AllTransaction", key= "#id")
    public void deleteTransaction(int id) {
        this.transactionRepository.deleteById(id);
    }

    @CacheEvict(value = "AllTransaction", key= "#id")
    public Transaction updateTransaction(int id, Transaction transaction) {
        Transaction existingTransaction = this.transactionRepository.findById(id).orElse(null);
        if (Objects.nonNull(existingTransaction)) {
            existingTransaction.setTransactionType(transaction.getTransactionType());
            existingTransaction.setAmount(transaction.getAmount());
            existingTransaction.setTransactionDate(transaction.getTransactionDate());
            existingTransaction.setStatus(transaction.getStatus());
            existingTransaction.setAccountId(transaction.getAccountId());
            existingTransaction.setDescription(transaction.getDescription());
            existingTransaction.setReferenceNumber(transaction.getReferenceNumber());
            return this.transactionRepository.save(existingTransaction);
        }
        return null;
    }
}
