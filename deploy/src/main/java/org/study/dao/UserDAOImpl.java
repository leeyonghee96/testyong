package org.study.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.study.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private static final String namespace = "org.study.mapper.userMapper";
	
	@Autowired
	private SqlSession session;	

	@Override
	public void insert(User user) throws Exception {
		
		session.insert(namespace + ".insert", user);
	}

	@Override
	public List<User> list() throws Exception {
		
		return session.selectList(namespace + ".list");
	}

}
