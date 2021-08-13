package com.sh.springsecexam.service;

import com.sh.springsecexam.entity.SecurityUser;
import com.sh.springsecexam.repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class CustomerUserDetailService implements UserDetailsService {


    @Autowired
    private UserAuthRepository userAuthRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        Optional<SecurityUser> user = userAuthRepository.findByUserId(userId);

        if (user.isPresent()) {
            SecurityUser securityUser = user.get();
            return securityUser;
        }else {
            new UsernameNotFoundException(userId);
            return null;
        }

    }
}
