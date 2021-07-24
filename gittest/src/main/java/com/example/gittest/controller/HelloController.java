package com.example.gittest;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/ui")
public class controller {

    @RequestMapping("/test")
    public void test(Integer id, HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        System.out.println(sessionId);
        System.out.println("hello");
        System.out.println("冲突测试");
        System.out.println("qjc12");
    }
}
