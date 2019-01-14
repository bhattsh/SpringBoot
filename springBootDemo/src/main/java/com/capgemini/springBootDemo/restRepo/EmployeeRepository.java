package com.capgemini.springBootDemo.restRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.springBootDemo.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
