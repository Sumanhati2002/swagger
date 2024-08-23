package com.swagger.service;

import java.util.List;

import com.swagger.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	Employee getEmployeeById(Integer id);

    List<Employee> getAllEmployees();
}
