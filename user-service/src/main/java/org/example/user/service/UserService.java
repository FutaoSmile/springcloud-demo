package org.example.user.service;


import com.idle.fish.spring.cloud.study.entity.UserEntity;

/**
 * @author idle fish
 * @since 2023/11/24
 */

public interface UserService {
    UserEntity getUserById(Long id);
}
