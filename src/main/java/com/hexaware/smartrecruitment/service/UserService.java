package com.hexaware.smartrecruitment.service;

import java.util.Optional;

import com.hexaware.smartrecruitment.entity.User;

public interface UserService {

	public User saveUser(User user);
	public Optional<User> findUserByUsername(String username);
}
