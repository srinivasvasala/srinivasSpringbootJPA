package com.srinivas.springbootJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinivas.springbootJPA.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
