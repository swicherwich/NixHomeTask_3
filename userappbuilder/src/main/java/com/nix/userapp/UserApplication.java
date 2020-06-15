package com.nix.userapp;

import com.nix.userapp.builder.DataBuilder;
import com.nix.userapp.service.UserService;
import com.nix.userapp.service.impl.UserServiceImpl;

public class UserApplication {
	public static void main(String[] args) {
		DataBuilder dataBuilder = new DataBuilder();
		dataBuilder.buildDataList();
	}
}
