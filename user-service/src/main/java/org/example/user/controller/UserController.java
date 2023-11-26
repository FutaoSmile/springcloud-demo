package org.example.user.controller;

import com.idle.fish.spring.cloud.study.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.example.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("detail/{id}")
    public UserEntity byId(@PathVariable("id") Long id, HttpServletRequest request) {
        log.info("id:{}", id);
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerVal = request.getHeader(headerName);
            log.info("header:{};{}", headerName, headerVal);
        }
        return userService.getUserById(id);
    }
}
