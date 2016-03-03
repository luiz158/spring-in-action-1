package com.springinaction.knights;

import org.springframework.stereotype.Component;

@Component("quest")
public class SlayDragonQuest implements Quest {

	public void embark() {
		System.out.println("Go!");
	}

}
