package com.sh.springsecexam.repository;

import com.sh.springsecexam.dto.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User get(String userId) {
        User user = new User();
        user.setUserId("rooney10");
        user.setPassword("1234");
        user.setName("rooney");
        user.setRole("USER");
        return user;
    }
}
