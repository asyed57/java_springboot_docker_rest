package com.asyed.user.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asyed.user.models.User;

@RestController
public class UserController {
	ArrayList<User> list = new ArrayList<User>();
	private int nextId = 0;
	
	@GetMapping("/users")
	public List<User> users() {
		return list;
	}
	
	@PostMapping("/users")
	public User user(@RequestBody User user) {
		user.setId(++nextId);
		list.add(user);
		return user;
	}
}
