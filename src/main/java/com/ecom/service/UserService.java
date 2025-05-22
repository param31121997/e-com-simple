package com.ecom.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecom.dao.UserDao;
import com.ecom.entities.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public ResponseEntity<?> registerNewUser(User newUser) {
		Optional<User> user =  userDao.findByUserName(newUser.getUserName());
		if (user.isPresent()) {
		    return ResponseEntity.status(HttpStatus.CONFLICT)
		        .body(Map.of("message", "Username already exists"));
		}
		 newUser.setUserPassword(getEncodedPassword(newUser.getUserPassword()));
		 newUser.setRole("User");
		 userDao.save(newUser);
		 return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
	public String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}
}
