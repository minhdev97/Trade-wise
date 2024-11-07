package com.trade_wise.trade_wise.service.Impl;

import com.trade_wise.trade_wise.service.CryptoService;
import org.springframework.stereotype.Service;

@Service
public class CryptoServiceImpl implements CryptoService {
    private void addCryto(String symbol) {
        String BinanceAPI = String.format("https://api.binance.com/api/v3/ticker/price?symbol=%sUSDT","BTC");
        System.out.println(BinanceAPI);
    }
}
