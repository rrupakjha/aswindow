package com.aswindows.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Properties {
	
	@Autowired
	ConfigProperties configprop;
	
	
	
	public Properties() {
		super();
		System.out.println("OBject created for Properties");
	}



	public String get(String key) {
		return configprop.getProperty(key);
	}

}
