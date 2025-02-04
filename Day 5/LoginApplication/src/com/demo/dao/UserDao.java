package com.demo.dao;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public interface UserDao {

	MyUser validatedetails(String uname, String pass);

	boolean registerDetails(RegisterUser r);

	RegisterUser getQuestion(String name);

	boolean changePassword(String uname, String npass);

}
