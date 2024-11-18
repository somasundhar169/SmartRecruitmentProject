package com.hexaware.smartrecruitment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.smartrecruitment.entity.User;
import com.hexaware.smartrecruitment.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
 
    public User saveUser(User user) {
        return userRepository.save(user);
    }
 
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
