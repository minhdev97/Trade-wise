package com.trade_wise.trade_wise.repository;

import com.trade_wise.trade_wise.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    Transaction findTransactionById(String id);
    List<Transaction> findALl();
}
