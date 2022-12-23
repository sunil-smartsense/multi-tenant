package com.ss.controller;

import com.ss.model.Employee;
import com.ss.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping(value = "employee/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public java.util.List<Employee> emploeeList() {
        return employeeRepo.findAll();
    }
}