package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.EmployeeRepository;
import com.example.entity.Employee;

@RestController
@RequestMapping("employee")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") String employeeId) {
		return employeeRepository.getEmployeeById(employeeId);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") String employeeId) {
		return employeeRepository.delete(employeeId);
	}

	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable("id") String employeeId, @RequestBody Employee employee) {
		return employeeRepository.update(employeeId, employee);
	}
}
