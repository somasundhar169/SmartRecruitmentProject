package com.hexaware.smartrecruitment.service;

import java.util.Optional;

import com.hexaware.smartrecruitment.dto.LoginRequest;
import com.hexaware.smartrecruitment.dto.SignupRequest;
import com.hexaware.smartrecruitment.entity.User;

public interface UserService {

	
	public Optional<User> findUserByUsername(String username);
	public Object authenticateUser(LoginRequest loginRequest);
	public Object registerUser(SignupRequest signUpRequest);
}
