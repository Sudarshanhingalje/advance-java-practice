package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	private UserDao udao;
	public UserServiceImpl()
	{
		udao=new UserDaoImpl();
	}
	@Override
	public MyUser validateUser(String uname, String pass) {
		
		return udao.authenticateUser(uname,pass);
	}
	
	
}
