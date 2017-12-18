package org.main.core;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{
	

	private static AnnotationConfigApplicationContext context;

	private static UserDAO userDAO;
	
	

  @BeforeClass
	public static void init(){
		context= new AnnotationConfigApplicationContext();
		context.scan("com.practice.scms");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userdao");
	}
	
	@org.junit.Test
    public void testAddEmployee()
    {
       
		User  user= new User();

		user.setName("sultan");
		user.setContact("9991123");
		user.setUsername("sultan");
	     user.setBatch("july");
		
      assertEquals("user save in database",true, userDAO.saveUser(user));
       
	
	
}
	
}	
