package com.nix.userapp.service.impl;

import com.nix.userapp.entity.User;
import com.nix.userapp.repository.UserRepository;
import com.nix.userapp.repository.impl.UserRepositoryImpl;
import com.nix.userapp.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
	
	UserRepository userRepository = new UserRepositoryImpl();
	
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}
	
	@Override
	public void saveOrUpdate(User user) {
		if(user.getId() == null) {
			long id = findAll().size();
			user.setId(++id);
			userRepository.save(user);
		} else {
			userRepository.update(user);
		}
	}
	
	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}
	
	@Override
	public User findById(long id) {
		return userRepository.findById(id);
	}
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
