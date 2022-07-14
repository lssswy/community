package com.nowcoder.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/")
    public String method1() {
        return "hello";
    }
}
