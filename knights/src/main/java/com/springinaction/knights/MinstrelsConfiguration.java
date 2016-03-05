package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MinstrelsConfiguration {

	// aspects
	@Bean 
	public Minstrel minstrel() {
		return new Minstrel();
	}
}
