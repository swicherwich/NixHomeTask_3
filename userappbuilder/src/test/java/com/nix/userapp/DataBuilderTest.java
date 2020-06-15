package com.nix.userapp;

import com.nix.userapp.builder.DataBuilder;
import com.nix.userapp.entity.User;
import com.nix.userapp.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBuilderTest {
	
	@Test
	public void builderTest() {
		DataBuilder dataBuilder = new DataBuilder();
		UserService userService = dataBuilder.getUserService();
		dataBuilder.buildDataList();
		
		assertEquals(2, userService.findAll().size());
	}
	
	@Test
	public void saveTest() {
		DataBuilder dataBuilder = new DataBuilder();
		UserService userService = dataBuilder.getUserService();
		dataBuilder.buildDataList();
		
		UserUtil<User> userUtil = new UserUtilImpl();
		
		User user = new User();
		
		userUtil.setFirstAndLast(user, "Mike Show");
		user.setEmail("mike.show@mail.com");
		userService.saveOrUpdate(user);
		
		assertEquals(3, userService.findAll().size());
	}
	
	@Test
	public void updateTest() {
		DataBuilder dataBuilder = new DataBuilder();
		UserService userService = dataBuilder.getUserService();
		dataBuilder.buildDataList();
		
		User user = new User();
		
		user.setEmail("newmike.show@mail.com");
		userService.saveOrUpdate(user);
		
		assertEquals(3, userService.findAll().size());
	}
	
	@Test
	public void findByEmailTest() {
		DataBuilder dataBuilder = new DataBuilder();
		UserService userService = dataBuilder.getUserService();
		dataBuilder.buildDataList();
		
		User user = new User();
		
		user.setEmail("testw@mail.com");
		userService.saveOrUpdate(user);
		
		assertEquals(user, userService.findByEmail("testw@mail.com"));
	}
}
