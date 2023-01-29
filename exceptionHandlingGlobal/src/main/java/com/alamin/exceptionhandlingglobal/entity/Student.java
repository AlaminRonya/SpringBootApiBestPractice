package com.alamin.exceptionhandlingglobal.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "student_tb")
public class Student {
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id")
    private Long id;
    @Column(name = "roll_number")
    private String rollNumber;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_email")
    private String email;
    @Column(name = "student_dob")
    private Date dob;
}
