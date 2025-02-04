package com.demo.dao;

import com.demo.beans.MyUser;

public interface UserDao {

	MyUser authenticateUser(String uname, String pass);

}
