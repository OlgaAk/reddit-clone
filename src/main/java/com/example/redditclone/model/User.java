package com.example.redditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    //@NotBlank(message = "Userame is required")
    private String userName;

    //@NotBlank(message = "Password is required")
    private String password;

    //@Email
    //@NotEmpty(message = "Email is required")
    private String email;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;

    private Instant createdDate;

    private boolean enabled;
}