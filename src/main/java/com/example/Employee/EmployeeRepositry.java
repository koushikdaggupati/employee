package com.example.Employee;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositry {
	private static Map<Integer,Employee> employeeMap= new HashMap<Integer,Employee>();
	static {
	Employee emp1= new Employee(1,"koushik",20000,"IT");
	Employee emp2= new Employee(2,"sai",20000,"Accounting");
	employeeMap.put(1,emp1);
	employeeMap.put(2,emp2);
	}
	public Map<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	}
	public String setEmployeeMap(Integer id,Employee emp) {
	    if (!EmployeeRepositry.employeeMap.containsKey(id)) {
	    	EmployeeRepositry.employeeMap.put(id, emp);
	    	return "Employee added";
        } else {
            return "Employe is already presant with same id";
        }
	}
	public void delEmployeeMap(Integer id) {
		EmployeeRepositry.employeeMap.remove(id);
	}
	public void replace(Integer id,Employee emp) {
		EmployeeRepositry.employeeMap.replace(id, emp);
	}
	
}
