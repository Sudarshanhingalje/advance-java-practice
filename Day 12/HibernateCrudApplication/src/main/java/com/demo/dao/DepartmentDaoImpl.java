package com.demo.dao;

import org.hibernate.SessionFactory;

public class DepartmentDaoImpl implements DepartmentDao {
	static SessionFactory sf;
	static {
		sf=HBUtil.getMySessionFactory();
	}
}
