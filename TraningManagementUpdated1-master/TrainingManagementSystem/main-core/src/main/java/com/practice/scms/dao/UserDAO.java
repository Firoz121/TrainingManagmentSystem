package com.practice.scms.dao;


/**
 * This class contains method releated database opertion.
 */
import com.practice.scms.model.User;


/**
 * This method save the user data in datbase.
 */

public interface UserDAO {

	public boolean saveUser(User user);
	
}
