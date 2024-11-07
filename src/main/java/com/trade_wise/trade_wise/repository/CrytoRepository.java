package com.trade_wise.trade_wise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trade_wise.trade_wise.entity.Crypto;
import org.springframework.stereotype.Repository;

@Repository
public interface CrytoRepository extends JpaRepository<Crypto, String> {
    Crypto findCryptosById(String id);
    Crypto findCryptosBySymbol(String symbol);
}
