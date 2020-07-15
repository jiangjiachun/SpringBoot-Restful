package com.jjc.web;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjc.entity.User;
import com.jjc.repository.UserRepository;

@RestController
@RequestMapping("/")
public class TestController {
	
	@Resource
	private UserRepository userRepository;

	@GetMapping("/cors")
	public ResponseEntity<User> cors() {

		Optional<User> user = userRepository.findById(1);
		return new ResponseEntity<User>(user.get(), new HttpHeaders(), HttpStatus.OK);
	}

}