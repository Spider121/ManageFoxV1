package com.manageFox.ManageFoxV1.controllers;

import com.manageFox.ManageFoxV1.model.Transaction;
import com.manageFox.ManageFoxV1.services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manageFoxV1/Api/Transactions")

public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/getAllTnx")
    public List<Transaction> getAllTransaction() {
        return this.transactionService.getAllTransaction();
    }

    @PostMapping("/addTransaction")
    public String addTransaction(@RequestBody Transaction transaction) {
        this.transactionService.saveTransaction(transaction);
        return "Transaction Completed Successfully ";
    }

    @DeleteMapping
    public String deleteTransaction(@PathVariable("id") String id) {
        this.transactionService.deleteTransaction(Integer.parseInt(id));
        return "Transaction  Deleted Successfully ";
    }

    @PutMapping("/UpdateTnx")
    public String updateTransaction(@PathVariable("id") String id, @RequestBody Transaction transaction) {
        Transaction ExtTransaction = this.transactionService.updateTransaction(Integer.parseInt(id), transaction);
        return ExtTransaction != null ? "Transaction Updated Successfully " : "Product Not Found";
    }
}
