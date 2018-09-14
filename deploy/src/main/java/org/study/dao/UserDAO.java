package org.study.dao;

import java.util.List;

import org.study.model.User;

public interface UserDAO {
	
	public void insert(User user) throws Exception;
	
	public List<User> list() throws Exception;
}
