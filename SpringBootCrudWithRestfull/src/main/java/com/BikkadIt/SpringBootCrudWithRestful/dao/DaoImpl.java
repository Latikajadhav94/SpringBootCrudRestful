package com.BikkadIt.SpringBootCrudWithRestful.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIt.SpringBootCrudWithRestful.model.Employee;

@Repository
public class DaoImpl implements DaoI{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int addEmployee(Employee employee) {
		Session session=sf.openSession();
		session.beginTransaction();
		int id=(int)session.save(employee);
		System.out.println(id);
		session.getTransaction().commit();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session = sf.openSession();
		String hql="from employee";
		 Query query = session.createQuery(hql);
		 List list = query.getResultList();
		return list;
	}

}
