package com.nix.userapp;

import com.nix.userapp.builder.DataBuilder;

public class UserApplication {
	public static void main(String[] args) {
		DataBuilder dataBuilder = new DataBuilder();
		dataBuilder.buildDataList();
	}
}
