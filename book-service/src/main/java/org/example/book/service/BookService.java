package org.example.book.service;


import com.idle.fish.spring.cloud.study.entity.BookEntity;

/**
 * @author idle fish
 * @since 2023/11/24
 */
public interface BookService {
    BookEntity getById(Long id);
}
 