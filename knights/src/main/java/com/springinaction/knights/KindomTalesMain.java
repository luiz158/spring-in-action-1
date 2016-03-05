package com.springinaction.knights;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KindomTalesMain {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.springinaction.knights")) {

			Knight knight = (Knight) context.getBean("knight");
			knight.embarkOnQuest();
		} 
		
		catch (QuestException e) {
			System.err.println(e);
		}
	}

}
