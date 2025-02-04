package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public interface UserService {

	MyUser validateUser(String uname, String pass);

	boolean registerUserDetails(RegisterUser r);

	RegisterUser findQuestion(String name);

	boolean changepassword(String uname, String npass);

}
