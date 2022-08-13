package com.BikkadIt.SpringBootCrudWithRestful.service;

import java.util.List;

import com.BikkadIt.SpringBootCrudWithRestful.model.Employee;

public interface ServiceI {

	
	
	public int saveEmployeeService(Employee employee);
	public List<Employee> getAllEmployeeService();
}
