package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class KnightsConfiguration {

	// beans
	@Bean
	public Quest quest() {
		return new SlayDragonQuest();
	}

	@Bean 
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
}
