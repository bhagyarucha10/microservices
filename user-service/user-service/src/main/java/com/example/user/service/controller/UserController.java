package com.example.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.VO.ResponseTemplateVO;
import com.example.user.service.entity.User;
import com.example.user.service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User SaveUser(@RequestBody User user)
	{
		userService.saveUser(user);
		return user;
	}
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserByDepartment(@PathVariable("id") Long userid)
	{
		return userService.getUserByDepartment(userid);
	}
}
