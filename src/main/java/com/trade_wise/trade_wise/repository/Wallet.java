package com.trade_wise.trade_wise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Wallet extends JpaRepository<Wallet, String> {
    Wallet findWalletById(String id);
}
