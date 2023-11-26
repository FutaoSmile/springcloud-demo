package org.example.borrow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@MapperScan("org.example.borrow.mapper")
@SpringBootApplication
@EnableFeignClients(basePackages = "com.idle.fish.spring.cloud.study.entity.client")
@EnableEurekaClient
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}
