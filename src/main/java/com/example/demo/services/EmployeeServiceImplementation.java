package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    
	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return empRepo.save(employee);
	}
	@Override
	public List<Employee> getEmployee() {
		
		return empRepo.findAll();
	}
	@Override
	public Employee getEmployeeBy(int id) {
		
		return empRepo.findById(id).get();
	}
	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Employee emp=empRepo.findById(id).get();
		emp.setEmpName(employee.getEmpName());
		emp.setEmpSalary(employee.getEmpSalary());
		
		return empRepo.save(emp);
	}
	@Override
	public String deleteEmployeeBtId(int id) {
		empRepo.deleteById(id);
		return "Such employee delete successfull!";
	}

}
