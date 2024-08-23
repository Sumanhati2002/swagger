package com.swagger.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.model.Employee;
import com.swagger.repo.EmployeeRepo;
import com.swagger.service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		
		Optional<Employee> optionalEmployee = employeeRepo.findById(id);
		return optionalEmployee.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) employeeRepo.findAll();
	}

}
