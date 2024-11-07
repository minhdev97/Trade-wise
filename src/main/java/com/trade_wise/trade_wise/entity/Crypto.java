package com.trade_wise.trade_wise.entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "cryptos")
public class Crypto {
    @Id
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="symbol")
    private String symbol;

    @Column(name="image")
    private byte[] image;

    @Column(name="is_active")
    private Boolean isActive;
}
