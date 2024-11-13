package com.trade_wise.trade_wise.repository;

import com.trade_wise.trade_wise.entity.TradeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeHistoryRepository extends JpaRepository<TradeHistory, String> {
    TradeHistory findTradeHistoryById(String id);
    List<TradeHistory> findAll();
}
