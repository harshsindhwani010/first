package com.sample.first.service;

import com.sample.first.entity.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    ResponseEntity<Object> addEmployee(Employee employee);
    ResponseEntity<Object> updateEmployee(Employee employee);
    ResponseEntity<Object> getAllEmployee();
    ResponseEntity<Object> getEmployeeById(Long id);
    ResponseEntity<Object> deleteEmployee(Long id);
}
