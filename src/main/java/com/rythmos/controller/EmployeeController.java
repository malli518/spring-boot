package com.rythmos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rythmos.dao.EmployeeDao;
import com.rythmos.entity.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;
	
	@PostMapping("/addEmployee")
	public List<Employee> addEmployee(@RequestBody Employee employee){
		employeeDao.addEmployee(employee);
		return employeeDao.getAllEmployees();		
	}	
}
