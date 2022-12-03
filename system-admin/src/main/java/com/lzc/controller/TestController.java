package com.lzc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: TestController
 * @Author luozouchen
 * @Date: 2022/12/3 13:48
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello ssm-pro";
    }
}
