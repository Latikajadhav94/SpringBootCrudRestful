package com.BikkadIt.SpringBootCrudWithRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIt.SpringBootCrudWithRestful.dao.DaoI;
import com.BikkadIt.SpringBootCrudWithRestful.model.Employee;

@Repository
public class ServiceImpl implements ServiceI {

	@Autowired
	private DaoI daoI;
	
	@Override
	public int addEmployeeService(Employee employee) {
	   System.out.println("Service layer");
	   System.out.println(employee);
	   int employee2 = daoI.addEmployee(employee);
		return employee2;
	}

	@Override
	public List<Employee> getAllEmployeeService() {
		List<Employee> list = daoI.getAllEmployee();
		return list;
	}

}
