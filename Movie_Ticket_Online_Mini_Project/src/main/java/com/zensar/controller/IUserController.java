package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.User;
import com.zensar.service.IUserService;

@RestController
public class IUserController {

	@Autowired
	IUserService service;

	// ADD USER
	@PostMapping(value = "/adduser")
	public User f1(@RequestBody User user) {
		return this.service.addUser(user);
	}

}