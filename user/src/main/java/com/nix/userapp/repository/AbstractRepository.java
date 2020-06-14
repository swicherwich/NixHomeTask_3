package com.nix.userapp.repository;

import com.nix.userapp.entity.AbstractEntity;
import com.nix.userapp.entity.User;

import java.util.List;

public interface AbstractRepository<T extends AbstractEntity> {
	
	void save(T t);
	void update(T t);
	void delete(T t);
	
	T findById(long id);
	List<T> findAll();
}
