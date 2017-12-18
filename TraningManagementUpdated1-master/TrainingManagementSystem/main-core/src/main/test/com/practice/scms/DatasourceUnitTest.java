package com.practice.scms;





import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;


import junit.framework.TestCase;



public class DatasourceUnitTest extends TestCase {
	
	private static AnnotationConfigApplicationContext context;

	private static UserDAO userDAO;
	
	

  @BeforeClass
	public static void init(){
		context= new AnnotationConfigApplicationContext();
		context.scan("com.practice.scms");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userdao");
	}
	
	@Test
    public void testAddEmployee()
    {
       
		User  user= new User();

		user.setName("sultan");
		user.setContact("9991123");
		user.setUsername("sultan");
		user.setPassword("sultan123");
		user.setBatch("july");
		
      
       assertEquals("user saved in database", true,userDAO.saveUser(user));

}


	
}

	