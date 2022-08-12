package com.BikkadIt.SpringBootCrudWithRestful.dao;

import java.util.List;

import com.BikkadIt.SpringBootCrudWithRestful.model.Employee;

public interface DaoI {

	public int addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	
	
}
