package com.trade_wise.trade_wise.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    private String user_id;
    private String name;
    private String username;
    private String password;
    private String email;
    private LocalDateTime lastSeen ;
    private byte[] image;
}
