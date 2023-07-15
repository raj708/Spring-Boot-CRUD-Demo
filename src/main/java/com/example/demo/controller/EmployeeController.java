package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	//Save Employee
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empService.saveEmployee(employee);
	}
	
	//Retrive Employee
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee() {
		return empService.getEmployee();
	}
	
	//Retrive Employee by Id
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return empService.getEmployeeBy(id);
	}
	
	//Update Employee
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable("id")int id, @RequestBody Employee employee) {
		return empService.updateEmployee(id,employee);
	}
    
	//Delete Employee
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id")int id) {
		return empService.deleteEmployeeBtId(id);
	}
}
