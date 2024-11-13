package com.trade_wise.trade_wise.entity;

import com.trade_wise.trade_wise.ulti.OrderType;
import com.trade_wise.trade_wise.ulti.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(length = 36, unique = true, nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;

    @Column(name = "order_type", nullable = false, length = 5)
    private OrderType orderType;

    @Column(precision = 18, scale = 8)
    private Double price;

    @Column(precision = 18, scale = 8)
    private Double amount;

    @Column(length = 10)
    private Status status;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

}

