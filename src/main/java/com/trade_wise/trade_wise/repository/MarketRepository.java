package com.trade_wise.trade_wise.repository;
import com.trade_wise.trade_wise.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketRepository extends JpaRepository<Market, String>{
    List<Market> findAll();
    Market findMarketById(String id);
}
