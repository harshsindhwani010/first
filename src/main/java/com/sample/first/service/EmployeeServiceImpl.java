package com.sample.first.service;

import com.sample.first.entity.Employee;
import com.sample.first.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
   // @Transactional("transactionManager2")
    public ResponseEntity<Object> addEmployee(Employee employee) {
        try {
            return new ResponseEntity<>(employeeRepo.save(employee), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("Not able ao save employee", HttpStatus.NOT_ACCEPTABLE);//exception handling
        }
    }

    @Override
    public ResponseEntity<Object> updateEmployee(Employee employee) {
        Optional<Employee> existing = employeeRepo.findById(employee.getId()); //first we will check employee exists or not
        if(existing.isPresent()){
            employeeRepo.save(employee);
            return new ResponseEntity<>("Employee update successfully!", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Object> getAllEmployee() {

        List<Employee> employees = employeeRepo.findAll();
        if(!employees.isEmpty()){
            return new ResponseEntity<>(employees, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No records found!", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Object> getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if(employee.isPresent()){
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No records found!", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Object> deleteEmployee(Long id) {
        Optional<Employee> existing = employeeRepo.findById(id); //first we will check employee exists or not
        if(existing.isPresent()){
            employeeRepo.deleteById(id);
            return new ResponseEntity<>("Employee deleted", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("employee not found", HttpStatus.NOT_FOUND);
        }
    }
}
