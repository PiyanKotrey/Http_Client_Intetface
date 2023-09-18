package com.example.http_client.error;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ErrorHandler extends RuntimeException {
    public ErrorHandler (String message){
        super(message);
    }
    public ErrorHandler (Throwable casue){
        super(casue);
    }
}
