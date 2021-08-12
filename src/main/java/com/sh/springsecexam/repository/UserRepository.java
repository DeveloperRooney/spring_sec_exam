package com.sh.springsecexam.repository;

import com.sh.springsecexam.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User get(String userId) {
        User user = new User();
        user.setUserId("rooney10");
        user.setUserPass("1234");
        user.setRole("USER");
        return user;
    }
}
