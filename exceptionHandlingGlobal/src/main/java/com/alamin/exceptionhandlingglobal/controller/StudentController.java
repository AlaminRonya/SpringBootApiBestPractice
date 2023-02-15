package com.alamin.exceptionhandlingglobal.controller;

import com.alamin.exceptionhandlingglobal.dto.RequestStudentDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/add")
    ResponseEntity<String> validateBody(@Valid @RequestBody RequestStudentDTO dto) {
        return ResponseEntity.ok("valid");
    }
    @PostMapping("/users")
    ResponseEntity<String> addUser(@Valid @RequestBody RequestStudentDTO user) {
        // persisting the user
        return ResponseEntity.ok("User is valid");
    }
}
