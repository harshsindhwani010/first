package com.sample.first.controller;

import com.sample.first.entity.Employee;
import com.sample.first.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/test")
    public ResponseEntity<Object> test(){
        return new ResponseEntity<>("This is my test controller", HttpStatus.OK);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<Object> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
