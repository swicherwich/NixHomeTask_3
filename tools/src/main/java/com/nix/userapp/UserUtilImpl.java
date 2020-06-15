package com.nix.userapp;

import com.nix.userapp.entity.User;

public class UserUtilImpl implements UserUtil<User> {
	
	public void setFirstAndLast(User user, String fullName) {
		String[] firstAndLast = fullName.split(" ");
		user.setFirstName(firstAndLast[0]);
		user.setFirstName(firstAndLast[1]);
	}
}
