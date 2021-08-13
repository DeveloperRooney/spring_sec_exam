package com.sh.springsecexam.repository;

import com.sh.springsecexam.entity.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthRepository extends JpaRepository<SecurityUser, Long> {

    Optional<SecurityUser> findByUserId(String userId);
}
