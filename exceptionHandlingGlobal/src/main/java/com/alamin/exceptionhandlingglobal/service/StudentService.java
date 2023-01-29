package com.alamin.exceptionhandlingglobal.service;

import com.alamin.exceptionhandlingglobal.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    
}
