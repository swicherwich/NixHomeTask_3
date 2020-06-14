package com.nix.userapp.builder;

import com.nix.userapp.entity.User;
import com.nix.userapp.service.UserService;
import com.nix.userapp.service.impl.UserServiceImpl;

import java.util.Map;

public class DataBuilder implements AbstractBuilder {

	private final UserService userService = new UserServiceImpl();
	
	@Override
	public void buildDataList() {
		for(Map.Entry<String, String> entry: getKeyValueMapByBundleProperties().entrySet()) {
			
			User user = new User();
			String[] userName = entry.getKey().split("_");
			String userEmail = entry.getValue();
			
			user.setFirstName(userName[0]);
			user.setLastName(userName[1]);
			user.setEmail(userEmail);
			
			userService.saveOrUpdate(user);
		}
		
		userService.findAll().forEach(currentUser -> {
			System.out.println("\nFirst name: " + currentUser.getFirstName() +
								"\nLast name: " + currentUser.getLastName() +
								"\nEmail: " + currentUser.getEmail()
			);
		});
	}
	
	public UserService getUserService() {
		return userService;
	}
}
