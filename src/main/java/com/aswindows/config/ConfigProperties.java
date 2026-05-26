package com.aswindows.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySources({@PropertySource(value = "classpath:config.${spring.profiles.active}.properties", ignoreResourceNotFound = false) })
public class ConfigProperties {

	
	public ConfigProperties() {
		super();
		System.out.println("Object created for ConfigProperties");
	}

	@Autowired
	private Environment env;

	public String getProperty(String key) {
		return env.getProperty(key);

	}
}
