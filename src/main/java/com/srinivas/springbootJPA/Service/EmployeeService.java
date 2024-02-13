package com.srinivas.springbootJPA.Service;

import com.srinivas.springbootJPA.Entity.Employee;

public interface EmployeeService {
	Employee findEmployee(Integer id);
	
	Employee createEmployee(Employee employee);
	

}
