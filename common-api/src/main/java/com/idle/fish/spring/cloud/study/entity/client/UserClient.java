package com.idle.fish.spring.cloud.study.entity.client;

import com.idle.fish.spring.cloud.study.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author idle fish
 * @since 2023/11/25
 */
@FeignClient(value = "user-service", path = "/user")
public interface UserClient {

    @GetMapping("detail/{id}")
    UserEntity byId(@PathVariable("id") Long id);
}
