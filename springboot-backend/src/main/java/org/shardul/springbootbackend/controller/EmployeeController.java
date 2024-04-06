package org.shardul.springbootbackend.controller;

import org.hibernate.sql.results.graph.embeddable.EmbeddableLoadingLogger;
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
    //Inorder to get json object from body @Requestbody annotation is used in parameters
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

    //Get Employee By ID rest API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeid)
    {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeid),HttpStatus.OK);
    }

    //Update Employee rest api
    @PutMapping("{id}")
    //Inorder to get json object from body @Requestbody annotation is used in parameters
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee)
    {
    return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }
    
}
