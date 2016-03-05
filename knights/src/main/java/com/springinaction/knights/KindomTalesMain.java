package com.springinaction.knights;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KindomTalesMain {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(KnightsConfiguration.class)) {

			Knight knight = (Knight) context.getBean(Names.BEAN_KNIGHT);
			knight.embarkOnQuest();
		} 
		
		catch (QuestException e) {
			System.err.println(e);
		}
	}

}
