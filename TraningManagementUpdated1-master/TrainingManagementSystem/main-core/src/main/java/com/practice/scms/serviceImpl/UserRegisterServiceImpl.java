package com.practice.scms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.scms.daoimpl.UserDAOImpl;
import com.practice.scms.model.User;

import com.practice.scms.service.UserRegisterService;



@Service
public class UserRegisterServiceImpl implements UserRegisterService{


	@Autowired
	UserDAOImpl userDaoImpl;
	
	public void registerUser(User user) {
		
		User user1 =  new User();
		user1.setName(user.getName());
		user1.setContact(user.getContact());
		user1.setUsername(user.getUsername());
	    user1.setUsername(user.getPassword());
	    user1.setBatch(user.getBatch());
		
		userDaoImpl.saveUser(user);
		
	}

	

}
