package com.nix.userapp.repository;

import com.nix.userapp.entity.User;

public interface UserRepository extends AbstractRepository<User> {

	User findByEmail(String email);
	User findByName(String name);
}
