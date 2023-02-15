package com.alamin.exceptionhandlingglobal.controller;

import com.alamin.exceptionhandlingglobal.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ErrorTestController {
    private final StudentService studentService;
    @GetMapping("/error")
    public ResponseEntity<String> errorHandling(){
//        try {
//            studentService.sayHelloException();
//        }catch (Exception e){
//            return new ResponseEntity<>("Exception==>"+e.getMessage(), HttpStatus.BAD_REQUEST);
//        }
        studentService.sayHelloException();
        return new ResponseEntity<>("Not Exception==>", HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<String> errorHandling1(){
        studentService.search(1l);
        return new ResponseEntity<>("Not Exception==>", HttpStatus.OK);
    }
}
