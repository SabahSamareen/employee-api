package com.sabah.employeeapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sabah.employeeapi.entity.Employee;
import com.sabah.employeeapi.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
