package org.example.bookshop.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
public class User {
    @Id
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String identification;
    private String password;
    private String email;


}
