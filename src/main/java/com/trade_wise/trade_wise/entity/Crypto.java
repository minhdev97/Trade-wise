package com.trade_wise.trade_wise.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "cryptos")
public class Crypto {

    @Id
    @Column(length = 36, unique = true, nullable = false)
    private String id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 5)
    private String symbol;

    @Lob
    private byte[] image;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "crypto")
    private List<Wallet> wallets;

    @OneToMany(mappedBy = "crypto")
    private List<TradeHistory> tradeHistories;

    // Getters, Setters, Constructors
}