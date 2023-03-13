package com.example.spmybtis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.spmybtis.entities.User;
import com.example.spmybtis.repositories.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<User> selectAll() {
		return userRepository.selectAll();
	}
	
	@GetMapping("/users/{id}")
	public User selectById(@PathVariable Long id) {
		return userRepository.selectById(id);
	}
	
	@GetMapping("/users/insert")
	public int insert() {
		User user = new User(3L,"Nguyễn Phương Nam");
		return userRepository.insert(user);
	}
}
