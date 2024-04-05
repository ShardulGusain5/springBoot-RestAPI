package org.shardul.springbootbackend.service;

import org.shardul.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService
{
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

}
