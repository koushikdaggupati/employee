package com.example.Employee;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	@GetMapping("")
	public Map<Integer,Employee> getEmployeeDetails(){
		return employeeservice.getDetails();
	}
	@PostMapping("")
	public String postEmployeeDetails(@RequestBody Employee emp) {
				return employeeservice.addEmployee(emp);
				
	}
	@PutMapping("")
	public String putEmployeeDetails(@RequestBody Employee emp) {
				employeeservice.updateEmployee(emp);
				return "Employee added";
	}
	@DeleteMapping("/{id}")
	public String putEmployeeDetails(@PathVariable Integer id) {
				employeeservice.deleteEmployee(id);
				return "Employee removed";
	}
	
	
}
