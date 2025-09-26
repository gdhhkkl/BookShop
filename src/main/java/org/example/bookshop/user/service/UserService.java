package org.example.bookshop.user.service;

import lombok.RequiredArgsConstructor;
import org.example.bookshop.user.domain.User;
import org.example.bookshop.user.dto.JoinDto;
import org.example.bookshop.user.repositroy.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor//생성자 주입
@Service
public class UserService {
    private final UserRepository userRepository;


    public User findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(()->new NullPointerException("없는 유저입니다."));
        return user;
    }
    public User findByIdentification(String identification){
        User userIdentification = userRepository.findByIdentification(identification);
        return userIdentification;
    }
    public User findByPassword(String password) {
        User userPassword = userRepository.findByPassword(password);
        return userPassword;
    }

    public void joincreat(JoinDto joinDto) {
        userRepository.save()
    }
}
