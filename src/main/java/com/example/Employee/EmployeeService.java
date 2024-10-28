package com.example.Employee;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepositry employeeRepositry;
	public Map<Integer, Employee> getDetails() {
		return employeeRepositry.getEmployeeMap();
	}

	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepositry.setEmployeeMap(emp.id,emp);
	}

	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeRepositry.replace(emp.id,emp);
		return "employee updated";
	}

	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepositry.delEmployeeMap(id);
	}


}
