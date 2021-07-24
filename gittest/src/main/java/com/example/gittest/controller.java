package com.example.gittest;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui")
public class controller {

    @RequestMapping("/test")
    public void test() {
        System.out.println("hello");
        System.out.println("冲突测试");
    }
}
