package com.se.springbootapi.service;

import com.se.springbootapi.entity.Employee;
import com.se.springbootapi.error.EmployeeNotFoundException;
import com.se.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(Long employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if(!employee.isPresent()){
            throw new EmployeeNotFoundException("Employee not found!");
        }
        return employee.get();
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
        employeeRepository.deleteById(employeeId);
    }
}
