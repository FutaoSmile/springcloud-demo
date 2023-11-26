package org.example.borrow.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.borrow.service.BorrowService;
import org.example.borrow.vo.BorrowDetail;
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
@Slf4j
@RequestMapping("/borrow")
@RestController
public class BrrowController {
    @Resource
    private BorrowService borrowService;

    @GetMapping("/uid/{uid}")
    public BorrowDetail byUId(@PathVariable("uid") Long uid, HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerVal = request.getHeader(headerName);
            log.info("header:{};{}", headerName, headerVal);
        }
        return borrowService.getByuId(uid);
    }

}
