package com.booksale.resources;

import java.util.List;

import com.booksale.domain.Employee;
import com.booksale.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResources
{
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employees")
    public List<Employee> getAll()
    {
        List<Employee> employees = repository.findAll();

        return employees;
    }
}