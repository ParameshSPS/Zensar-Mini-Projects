package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.User;
import com.zensar.db.IUserDAO;

@Service
public class IUserService {

	@Autowired
	IUserDAO dao;

	// ADD SERVICE
	public User addUser(User user) {
		return this.dao.save(user);
	}

}