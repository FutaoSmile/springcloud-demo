package org.example.user.service.impl;

import com.idle.fish.spring.cloud.study.entity.UserEntity;
import org.example.user.mapper.UserMapper;
import org.example.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserEntity getUserById(Long id) {
        return userMapper.selectById(id);
    }
}
