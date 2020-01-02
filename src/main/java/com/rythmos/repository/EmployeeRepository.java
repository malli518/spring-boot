package com.rythmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rythmos.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
