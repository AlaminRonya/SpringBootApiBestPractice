package com.alamin.exceptionhandlingglobal.mapper;

import com.alamin.exceptionhandlingglobal.dto.ResponseStudentDTO;
import com.alamin.exceptionhandlingglobal.entity.Student;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ResponseStudentDTOMapper implements Function<Student, ResponseStudentDTO> {
    @Override
    public ResponseStudentDTO apply(Student student) {
        return new ResponseStudentDTO(
                student.getId(), student.getRollNumber(), student.getName(),
                student.getEmail(), student.getDob()
        );
    }
}
