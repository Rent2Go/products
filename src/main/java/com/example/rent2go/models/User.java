package com.example.rent2go.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Email(message = "email@example.com gibi olmalıdır.")
    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "email")
    private String email;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "password")
    private String password;
}