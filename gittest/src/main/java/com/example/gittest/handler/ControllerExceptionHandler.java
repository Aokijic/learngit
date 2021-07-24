package com.example.gittest.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void exceptionHandler(Exception ex) {
        System.out.println("出问题了");
    }
}
