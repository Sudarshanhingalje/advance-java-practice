package com.demo.service;

import com.demo.dao.DepartmentDao;
import com.demo.dao.DepartmentDaoImpl;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class DepartmentServiceImpl implements DepartmentService{
	private DepartmentDao ddao;

	public DepartmentServiceImpl() {
		
		ddao=new DepartmentDaoImpl();
	}
}
