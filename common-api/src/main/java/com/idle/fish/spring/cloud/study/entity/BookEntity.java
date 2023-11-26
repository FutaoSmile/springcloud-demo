package com.idle.fish.spring.cloud.study.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@Data
@TableName("db_book")
public class BookEntity {
    @TableId
    private Long bid;
    private String name;
    private String desc;
}
