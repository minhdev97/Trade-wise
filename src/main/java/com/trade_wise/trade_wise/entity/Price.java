package com.trade_wise.trade_wise.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prices")
public class Price {

    @Id
    @Column(length = 36, unique = true, nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;

    @Column(precision = 18, scale = 8)
    private Double price;

    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

}
