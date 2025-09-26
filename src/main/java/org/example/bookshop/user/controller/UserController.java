package org.example.bookshop.user.controller;


import lombok.RequiredArgsConstructor;
import org.example.bookshop.user.domain.User;
import org.example.bookshop.user.dto.JoinDto;
import org.example.bookshop.user.service.UserService;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor//생성자 주입
@Controller
public class UserController {
    private final UserService userService;


    @PostMapping
    public String join (JoinDto joinDto){
        userService.joincreat(joinDto);
    }
}
