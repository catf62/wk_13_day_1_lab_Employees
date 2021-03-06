package com.employees2.employees_lab_2.controllers;

import com.employees2.employees_lab_2.models.Employee;
import com.employees2.employees_lab_2.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getPirate(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

}
