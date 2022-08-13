package com.BikkadIt.SpringBootCrudWithRestful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.SpringBootCrudWithRestful.model.Employee;
import com.BikkadIt.SpringBootCrudWithRestful.service.ServiceI;

@Controller
public class EmployeeController {

	@Autowired
	private ServiceI serviceI;
	
	@PostMapping(value = "/SaveEmployee" ,consumes = "application/json", produces = "application/json")
	public ResponseEntity<Integer> addEmployeeService(@RequestBody Employee employee) {
		int id = serviceI.saveEmployeeService(employee);
		
		return new ResponseEntity<Integer>(id,HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Employee>>getAllEmployeeService(){
		
		List<Employee> employee = serviceI.getAllEmployeeService();
		return new ResponseEntity<List<Employee>>(employee,HttpStatus.OK);
	}
	
}
