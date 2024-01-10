package com.example.rent2go.repositories;

import com.example.rent2go.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
