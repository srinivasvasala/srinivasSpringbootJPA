package com.srinivas.springbootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srinivas.springbootJPA.Entity.Employee;
import com.srinivas.springbootJPA.Service.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("findEmployees")
	public Employee findEmployees(@RequestBody Employee employee) {
		return employeeService.findEmployee(employee.getId());
	}
	
	@PostMapping("createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

}
