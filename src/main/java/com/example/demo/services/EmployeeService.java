package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getEmployee();

	 Employee getEmployeeBy(int id);

	Employee updateEmployee(int id, Employee employee);

	String deleteEmployeeBtId(int id);
		
	
	

}
