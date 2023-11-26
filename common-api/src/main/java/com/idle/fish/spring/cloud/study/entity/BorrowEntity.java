package com.idle.fish.spring.cloud.study.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@Data
@TableName("db_borrow")
public class BorrowEntity {
    @TableId
    private Long id;
    private Long bid;
    private Long uid;
}
