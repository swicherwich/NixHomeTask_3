package com.nix.userapp.service;

import com.nix.userapp.entity.AbstractEntity;

import java.util.List;

public interface AbstractService<T extends AbstractEntity> {
	void saveOrUpdate(T t);
	void remove(T t);
	
	T findById(long id);
	List<T> findAll();
}
