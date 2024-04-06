package org.shardul.springbootbackend.service.impl;

import org.shardul.springbootbackend.exception.ResourceNotFoundException;
import org.shardul.springbootbackend.model.Employee;
import org.shardul.springbootbackend.repository.EmployeeRepository;
import org.shardul.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee)

    {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
       Optional<Employee> employee= employeeRepository.findById(id);
       if(employee.isPresent()){
           return employee.get();
       }else
       {
           throw new ResourceNotFoundException("Employee","Id",id);
           //this creates a proper message
       }
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existEmployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Employee","Id",id)
        );
        existEmployee.setFirstName(employee.getFirstName());
        existEmployee.setLastName(employee.getLastName());
        existEmployee.getEmail(employee.getEmail());
        //saving
        employeeRepository.save(existEmployee);
        return existEmployee;
    }
}
