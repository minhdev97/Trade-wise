package com.trade_wise.trade_wise.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "markets")
public class Market {

    @Id
    @Column(length = 36, unique = true, nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "base_crypto_id")
    private Crypto baseCrypto;

    @ManyToOne
    @JoinColumn(name = "quote_crypto_id")
    private Crypto quoteCrypto;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToMany(mappedBy = "market")
    private List<Order> orders;

    @OneToMany(mappedBy = "market")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "market")
    private List<Price> prices;

}

