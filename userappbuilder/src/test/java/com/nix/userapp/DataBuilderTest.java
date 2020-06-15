package com.nix.userapp;

import com.nix.userapp.builder.DataBuilder;
import com.nix.userapp.entity.User;
import com.nix.userapp.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBuilderTest {
	
	private DataBuilder dataBuilder = new DataBuilder();
	private UserService userService = dataBuilder.getUserService();
	
	@Test
	public void builderTest() {
		dataBuilder.buildDataList();
		
		assertEquals(2, userService.findAll().size());
	}
	
	@Test
	public void deleteTest() {
		dataBuilder.buildDataList();
		
		userService.findAll().forEach(user -> {
			userService.delete(user);
		});
		
		assertEquals(0, userService.findAll().size());
	}
	
	@Test
	public void saveTest() {
		dataBuilder.buildDataList();
		UserUtil<User> userUtil = new UserUtilImpl();
		
		User user = new User();
		
		userUtil.setFirstAndLast(user, "Mike Show");
		user.setEmail("mike.show@mail.com");
		userService.saveOrUpdate(user);
		
		assertEquals(1, userService.findAll().size());
	}
}
