package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public interface UserDao extends JpaRepository<MyUser,String>{

}
