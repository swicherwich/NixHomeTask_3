package com.nix.userapp;

import com.nix.userapp.builder.DataBuilder;
import com.nix.userapp.service.UserService;
import com.nix.userapp.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBuilderTest {

	@Test
	public void builderTest() {
		DataBuilder dataBuilder = new DataBuilder();
		UserService userService = new UserServiceImpl();
		dataBuilder.buildDataList();
		
		assertEquals(2, userService.findAll().size());
		
		
		
	}
}
