package com.hexaware.smartrecruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.smartrecruitment.dto.LoginRequest;
import com.hexaware.smartrecruitment.dto.SignupRequest;
import com.hexaware.smartrecruitment.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	

    @Autowired
   private UserService userService;

	@PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
		return new ResponseEntity<>(userService.authenticateUser(loginRequest),HttpStatus.OK);
	}
	
	
	 @PostMapping("/signup")
	 public ResponseEntity<?> registerUser( @RequestBody SignupRequest signUpRequest) {
		 
		 return new ResponseEntity<>(userService.registerUser(signUpRequest),HttpStatus.CREATED);
	 }
	
}
