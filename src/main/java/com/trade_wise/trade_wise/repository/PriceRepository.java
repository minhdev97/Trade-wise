package com.trade_wise.trade_wise.repository;

import com.trade_wise.trade_wise.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<Price, String> {
    Price findPriceById(String id);
    List<Price> findAll();
}
