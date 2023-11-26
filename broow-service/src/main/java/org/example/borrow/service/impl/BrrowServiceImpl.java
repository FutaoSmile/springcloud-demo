package org.example.borrow.service.impl;


import com.idle.fish.spring.cloud.study.entity.UserEntity;
import com.idle.fish.spring.cloud.study.entity.client.UserClient;
import org.example.borrow.controller.BrrowController;
import org.example.borrow.mapper.BorrowMapper;
import org.example.borrow.service.BorrowService;
import org.example.borrow.vo.BorrowDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/24
 */
@Service
public class BrrowServiceImpl implements BorrowService {
    @Resource
    private BorrowMapper borrowMapper;

    @Resource
    private UserClient userClient;

    @Override
    public BorrowDetail getByuId(Long id) {
        UserEntity userEntity = userClient.byId(id);
        BorrowDetail borrowDetail = new BorrowDetail();
        borrowDetail.setUser(userEntity);
        return borrowDetail;
    }
}
