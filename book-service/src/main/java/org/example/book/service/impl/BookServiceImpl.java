package org.example.book.service.impl;

import com.idle.fish.spring.cloud.study.entity.BookEntity;
import org.example.book.mapper.BookMapper;
import org.example.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public BookEntity getById(Long id) {
        return bookMapper.selectById(id);
    }
}
