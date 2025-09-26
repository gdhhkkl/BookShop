package org.example.bookshop.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.bookshop.user.domain.User;
@Getter
@NoArgsConstructor
public class JoinDto {
    private String name;
    private String email;
    private String identification;
    private String password;

    public JoinDto(String name, String email, String identification, String password) {
        this.name = name;
        this.email = email;
        this.identification = identification;
        this.password = password;
    }
    public User toEntity(){
        return User.builder()
                .name(name)
                .email(email)
                .identification(identification)
                .password(password).build();
    }
}
