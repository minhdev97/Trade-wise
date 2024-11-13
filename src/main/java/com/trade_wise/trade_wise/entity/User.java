package com.trade_wise.trade_wise.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(length = 36, unique = true, nullable = false)
    private String id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "lastseen_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSeenAt;

    @OneToMany(mappedBy = "user")
    private List<Wallet> wallets;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    @OneToMany(mappedBy = "user")
    private List<TradeHistory> tradeHistories;

    @OneToMany(mappedBy = "buyer")
    private List<Transaction> boughtTransactions;

    @OneToMany(mappedBy = "seller")
    private List<Transaction> soldTransactions;

}
