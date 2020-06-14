package com.nix.userapp.service;

import com.nix.userapp.entity.User;

public interface UserService extends AbstractService<User> {
	
	User findByEmail(String email);
	User findByName(String name);
}
