package org.example.borrow.vo;

import com.idle.fish.spring.cloud.study.entity.BookEntity;
import com.idle.fish.spring.cloud.study.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BorrowDetail {
    private UserEntity user;
    private List<BookEntity> bookEntityList;
}