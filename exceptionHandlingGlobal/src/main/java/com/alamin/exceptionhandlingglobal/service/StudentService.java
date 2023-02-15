package com.alamin.exceptionhandlingglobal.service;

import com.alamin.exceptionhandlingglobal.entity.Student;
import com.alamin.exceptionhandlingglobal.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public void sayHelloException(){
        System.out.println("=======================");
    }

    public void search(long l) {
        final Optional<Student> byId = studentRepository.findById(l);
        byId.get().getDob();
    }
}
