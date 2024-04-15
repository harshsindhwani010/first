package com.sample.first.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "emp_record")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Double salary;
    private String fullName;
}
