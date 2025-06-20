package com.auth.authapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Transient // won't be stored in DB
    private String confirmPassword;

    private String password;

    private String role; // ex: USER, ADMIN
}
