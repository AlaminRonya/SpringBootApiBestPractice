package com.alamin.exceptionhandlingglobal.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalApiException {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> nullPointerException(NullPointerException e){
        return ResponseEntity.badRequest().body("GlobalException null pointer exception==>"+e.getMessage());
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<?> noSearchException(NoSuchElementException e){
        return ResponseEntity.badRequest().body("GlobalException No value present==>"+e.getMessage());
    }
    @ExceptionHandler
    public ResponseEntity<?> handleException(Exception e){
        return ResponseEntity.badRequest().body("GlobalException==>"+e.getMessage());
    }
}
