package com.example.shoppingPlatform.repository;

import com.example.shoppingPlatform.model.UserPO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserPO, Long> {
}
