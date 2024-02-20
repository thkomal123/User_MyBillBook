package com.mybillbook.services;

import java.util.List;

import com.mybillbook.entities.User;

public interface UserService {

	String createUser(User user);
	String updateUser(User user);
	String deleteUser(User user);
	User getUserById(String UserId);
	List <User> getAllUsers();
	
	
}
