package org.shardul.springbootbackend.service.impl;

import org.shardul.springbootbackend.model.Employee;
import org.shardul.springbootbackend.repository.EmployeeRepository;
import org.shardul.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
