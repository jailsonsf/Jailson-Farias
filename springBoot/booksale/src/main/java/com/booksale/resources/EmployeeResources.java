package com.booksale.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.booksale.domain.Employee;
import com.booksale.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping("/employees")
    public ResponseEntity<?> saveBook(@RequestBody Employee employee)
    {
        Employee savedEmployee = repository.save(employee);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedEmployee.getId()).
            toUri();

        return ResponseEntity.created(uri).body("Name and Id of the new Book Publisher: " +
            savedEmployee.getName() + " - " + savedEmployee.getId());
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<?> updateAuthor (@RequestBody Employee employee, @PathVariable int id)
    {
        Optional<Employee> employeeFound = repository.findById(id);

        if (!employeeFound.isPresent())
        {
            return ResponseEntity.notFound().build();
        }

        employee.setId(id);
        repository.save(employee);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteAuthor(@PathVariable int id)
    {
        Optional<Employee> employeeFound = repository.findById(id);

        if (employeeFound.isPresent())
        {
            repository.deleteById(id);
        }
    }
}