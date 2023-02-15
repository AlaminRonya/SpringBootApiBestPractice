package com.alamin.exceptionhandlingglobal.dto;


import com.alamin.exceptionhandlingglobal.annotation.NullValid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

//@Data
public record RequestStudentDTO(
//        @NotBlank
        @NullValid( message = "Null value====================>")
        String name
){
//        @NotBlank
//        private String name;

}
