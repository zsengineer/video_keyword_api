package com.example.demo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class DataNotFoundException extends RuntimeException{
    private String message;

    public DataNotFoundException() {}

    public DataNotFoundException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}