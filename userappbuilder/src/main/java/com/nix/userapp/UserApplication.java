package com.nix.userapp;

import com.nix.userapp.builder.DataBuilder;
import com.nix.userapp.repository.impl.UserRepositoryImpl;
import com.nix.userapp.service.UserService;
import com.nix.userapp.service.impl.UserServiceImpl;

public class UserApplication {
	public static void main(String[] args) {
		DataBuilder dataBuilder = new DataBuilder();
		UserService userService = new UserServiceImpl();
		dataBuilder.buildDataList();
		
		userService.findAll().forEach(currentUser -> {
			System.out.println("\nFirst name: " + currentUser.getFirstName() +
					"\nLast name: " + currentUser.getLastName() +
					"\nEmail: " + currentUser.getEmail()
			);
		});
		
	}
}
