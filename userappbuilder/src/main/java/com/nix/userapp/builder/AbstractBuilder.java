package com.nix.userapp.builder;

import com.nix.userapp.util.BundleUtil;

import java.util.Map;

public interface AbstractBuilder {
	
	default Map<String, String> getKeyValueMapByBundleProperties() {
		return BundleUtil.getBundleProperties();
	}
	
	void buildDataList();
}