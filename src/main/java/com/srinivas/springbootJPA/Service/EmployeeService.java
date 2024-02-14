package com.srinivas.springbootJPA.Service;

import com.srinivas.springbootJPA.Entity.Employee;

import java.util.List;

public interface EmployeeService {
	Employee findEmployee(Integer id);
	
	Employee createEmployee(Employee employee);

	List<Employee> findAllEmployees();

	Employee updateEmployee(Employee employee);

	 void deleteEmployee(Integer id);
}
