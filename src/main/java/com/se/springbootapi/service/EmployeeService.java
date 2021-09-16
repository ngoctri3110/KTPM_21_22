package com.se.springbootapi.service;

import com.se.springbootapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public Employee getEmployeeById(Long employeeId);
    public List<Employee> getAllEmployees();
    public Employee saveEmployee(Employee employee);
    public Employee updateEmployeeById(Long employeeId, Employee employee);
    public void deleteById(Long employeeId);

}
