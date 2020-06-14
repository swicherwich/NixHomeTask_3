package com.nix.userapp.repository.impl;

import com.nix.userapp.entity.User;
import com.nix.userapp.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserUserRepositoryImpl implements UserRepository {
	
	List<User> users = new ArrayList<>();
	
	@Override
	public User findByEmail(String email) {
		for(User currentUser: users) {
			if(currentUser.getEmail().equals(email)) {
				return currentUser;
			}
		}
		return null;
	}
	
	@Override
	public User findByName(String name) {
		for(User currentUser: users) {
			if(currentUser.getFirstName().equals(name)) {
				return currentUser;
			}
		}
		return null;
	}
	
	@Override
	public void save(User user) {
		users.add(user);
	}
	
	@Override
	public void update(User user) {
		users.forEach(currentUser -> {
			if(currentUser.getId().equals(user.getId())) {
				currentUser.setEmail(user.getEmail());
			}
		});
	}
	
	@Override
	public void delete(User user) {
		users.forEach(currentUser -> {
			if(currentUser.getId().equals(user.getId())) {
				users.remove(user);
			}
		});
	}
	
	@Override
	public User findById(long id) {
		for(User currentUser: users) {
			if(currentUser.getId().equals(id)) {
				return currentUser;
			}
		}
		return null;
	}
	
	@Override
	public List<User> findAll() {
		return users;
	}
}
