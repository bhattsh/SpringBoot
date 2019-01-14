package com.capgemini.springBootDemo.restService;

import java.util.List;

import com.capgemini.springBootDemo.employee.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
