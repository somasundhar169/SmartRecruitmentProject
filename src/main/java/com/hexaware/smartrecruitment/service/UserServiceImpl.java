package com.hexaware.smartrecruitment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.smartrecruitment.dto.LoginRequest;
import com.hexaware.smartrecruitment.dto.SignupRequest;
import com.hexaware.smartrecruitment.entity.User;
import com.hexaware.smartrecruitment.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
 
   
 
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }



	@Override
	public Object authenticateUser(LoginRequest loginRequest) {
		
		return null;
	}



	@Override
	public Object registerUser(SignupRequest signUpRequest) {
		signUpRequest.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
		User user=new User(signUpRequest.getUsername(),signUpRequest.getPassword(),signUpRequest.getRole());
		return userRepository.save(user);
	}
}
