package org.example.borrow.service;

import org.example.borrow.vo.BorrowDetail;

/**
 * @author idle fish
 * @since 2023/11/24
 */
public interface BorrowService {
    BorrowDetail getByuId(Long id);
}
 