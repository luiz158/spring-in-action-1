package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class KnightsConfiguration {


	// beans
	@Bean
	public Quest quest() {
		return new SlayDragonQuest();
	}

	@Bean(name=Names.BEAN_KNIGHT) 
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
}
