package com.manageFox.ManageFoxV1.repositories;

import com.manageFox.ManageFoxV1.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

}
