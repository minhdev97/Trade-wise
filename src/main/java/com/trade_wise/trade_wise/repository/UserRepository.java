package com.trade_wise.trade_wise.repository;

import com.trade_wise.trade_wise.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
