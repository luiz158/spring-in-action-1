package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class KingdomTalesConfiguration {

	// beans
	@Bean
	public Quest quest() {
		return new SlayDragonQuest();
	}

	@Bean 
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	// aspects
	@Bean 
	public Minstrel minstrel() {
		return new Minstrel();
	}
}
