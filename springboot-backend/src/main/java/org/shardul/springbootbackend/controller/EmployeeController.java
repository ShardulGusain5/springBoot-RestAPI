package org.shardul.springbootbackend.controller;

import org.shardul.springbootbackend.model.Employee;
import org.shardul.springbootbackend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{
     private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //Get all Employees rest api
    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }


}
