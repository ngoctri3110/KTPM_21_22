package com.se.springbootapi.service;

import com.se.springbootapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Employee getEmployeeById(Long employeeId) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployeeById(Long employeeId, Employee employee) {
        return null;
    }

    @Override
    public void deleteById(Long employeeId) {

    }
}
