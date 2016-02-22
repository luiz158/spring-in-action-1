package com.springinaction.knights;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springinaction/knights/knights.xml")) {
			
			Knight knight = (Knight) context.getBean("knight");
			knight.embarkOnQuest();
		} 
		catch (QuestException e) {
			System.err.println(e);
		}
	}

}
