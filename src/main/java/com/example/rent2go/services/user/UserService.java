package com.example.rent2go.services.user;

import com.example.rent2go.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(int userId);
    User addUser(User user);
    User updateUser(int userId, User updatedUser);
    void deleteUser(int userId);
}

