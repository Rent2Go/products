package com.example.rent2go.controllers;

import com.example.rent2go.models.User;
import com.example.rent2go.services.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping
        public List<User> getAllUsers() {
            return userService.getAllUsers();
        }

        @GetMapping("/{id}")
        public Optional<User> getUserById(@PathVariable int id) {
            return userService.getUserById(id);
        }

        @PostMapping
        public User addUser(@Valid @RequestBody User user) {
            return userService.addUser(user);
        }

        @PutMapping("/{id}")
        public User updateUser(@PathVariable int id, @Valid @RequestBody User updatedUser) {
            return userService.updateUser(id, updatedUser);
        }

        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable int id) {
            userService.deleteUser(id);
        }
}
