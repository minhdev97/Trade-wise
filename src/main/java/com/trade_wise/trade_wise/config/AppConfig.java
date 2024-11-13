package com.trade_wise.trade_wise.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate() {

        CorsConfiguration config = new CorsConfiguration();

        return new RestTemplate();
    }
}
