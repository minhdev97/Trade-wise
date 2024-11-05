package com.trade_wise.trade_wise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class BinanceService {
    private final RestTemplate restTemplate;

    @Autowired
    public BinanceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
