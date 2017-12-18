package com.practice.scms.daoimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


import com.practice.scms.dao.BaseDAO;

import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

/**
 * this class has implementation of methods releated database opertion.
 * @author firoz
 *
 */

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO{

	
	public boolean saveUser(User user) {
	
		String sql = "insert into users1(name, contact , username, password ,batch) values (:name, :contact ,:username,:password, :batch)";
		Map< String, Object> map = new HashMap();
		
		map.put("name", user.getName());
		map.put("contact", user.getContact());
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		map.put("batch", user.getBatch());
		
		
		KeyHolder kh = new GeneratedKeyHolder();  // Primary key id generation
		
		SqlParameterSource ps = new MapSqlParameterSource(map);
		getNamedParameterJdbcTemplate().update(sql, ps, kh);
		
		Integer userId = kh.getKey().intValue();
		
		user.setId(userId);
		
		return true;
		
	}

}

	
	
