package com.nix.userapp;

import com.nix.userapp.entity.AbstractEntity;
import com.nix.userapp.entity.User;

import java.util.List;

public interface UserUtil<T extends AbstractEntity> {
	void setFirstAndLast(T t, String fullName);
}
