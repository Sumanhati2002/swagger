package com.swagger.repo;

import org.springframework.data.repository.CrudRepository;

import com.swagger.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
