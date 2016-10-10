package com.springmvc.service;

import java.util.List;

import com.springmvc.model.User;


public interface UserService {
	
	public User getUser(User user);
	public int insertUser(User user);	
	public int updateUser(User user);
	public int deleteUser(Integer UserId);
	public List<User> getAll();
	


}
