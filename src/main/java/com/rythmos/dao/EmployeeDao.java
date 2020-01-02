package com.rythmos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rythmos.entity.Employee;
import com.rythmos.repository.EmployeeRepository;

@Component
public class EmployeeDao {
	@Autowired 
	private EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee){
		 employeeRepository.save(employee);
		 System.out.println("Successfully inserted..");
	}
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();		
	} 
	

}
