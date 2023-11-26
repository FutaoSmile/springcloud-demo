package com.idle.fish.spring.cloud.study.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@Data
@TableName("db_user")
public class UserEntity {
    @TableId
    private Long uid;
    private String name;
    private String sex;
    private Integer age;
}
