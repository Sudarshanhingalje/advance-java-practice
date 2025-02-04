package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void closeMyConnection();

	void addnewEmployee();

	List<Employee> getAllEmployee();

}
