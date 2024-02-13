package com.srinivas.springbootJPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srinivas.springbootJPA.Entity.Employee;
import com.srinivas.springbootJPA.Repository.EmployeeRepository;
@Component
public class  EmployeeServiceImpl implements EmployeeService {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee findEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}
