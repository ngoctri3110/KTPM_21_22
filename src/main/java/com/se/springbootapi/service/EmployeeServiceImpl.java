package com.se.springbootapi.service;

import com.se.springbootapi.entity.Employee;
import com.se.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeeById(Long employeeId, Employee employee) {
        Employee employeeDB = employeeRepository.findById(employeeId).get();
        employeeDB.setFirstName(employee.getLastName());
        employeeDB.setLastName(employee.getLastName());
        employeeDB.setEmail(employee.getEmail());
        return employeeRepository.save(employeeDB);
    }

    @Override
    public void deleteById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        employeeRepository.delete(employee);
    }
}
