package com.deploy.praktikum7.repository;


import com.deploy.praktikum7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
}
