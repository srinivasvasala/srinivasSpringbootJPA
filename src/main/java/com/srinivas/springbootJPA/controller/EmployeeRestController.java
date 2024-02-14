package com.srinivas.springbootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.srinivas.springbootJPA.Entity.Employee;
import com.srinivas.springbootJPA.Service.EmployeeService;

import java.util.List;

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

	@GetMapping("findAllEmployees")
	public List<Employee> findAllEmployees(){
		return employeeService.findAllEmployees();
	}


	@PutMapping("updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee){
		return employeeService.updateEmployee(employee);
	}


	@DeleteMapping("deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable Integer id){
		employeeService.deleteEmployee(id);
	}

}
