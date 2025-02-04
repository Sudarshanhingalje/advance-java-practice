package com.demo.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static SessionFactory sf;
	static {
		sf=HBUtil.getMySessionFactory();
	}
	@Override
	public void closeMyConnection() {
		HBUtil.closeMyConnection();
		
	}
	@Override
	public void saveEmp(Employee e1) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1);
		session.save(e1.getDept());
		tr.commit();
		session.close();
		System.out.println("data svaed");
		
		
	}
	@Override
	public List<Employee> findAllEmp() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("from Employee");
		List<Employee> elist=query.list();
		tr.commit();
		session.close();
		return elist;
	}

}
