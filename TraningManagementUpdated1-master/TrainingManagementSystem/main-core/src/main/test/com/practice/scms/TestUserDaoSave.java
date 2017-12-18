package com.practice.scms;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.practice.scms.configuration.SpringRootConfig;

import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;


public class TestUserDaoSave {

	public static void main(String[] args) {
		
		System.out.println("Start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		System.out.println(ctx);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
	
		User user = new User();
		
		
		user.setName("sultan");
		user.setContact("9991123");
		user.setUsername("sultan");
		user.setPassword("sultan123");
		user.setBatch("july");
		
		userDAO.saveUser(user);
		System.out.println("User Saved");
		
		ctx.close();
		
	}

}
