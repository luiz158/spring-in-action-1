package com.springinaction.knights;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Minstrel {
	
	@Pointcut("execution(void com.springinaction.knights.Knight.embarkOnQuest())")
	public void embark() {
	}

	@Before("embark()")
	public void singBeforeQuest() {
		System.out.println("Fa la la; The knight is so brave!");
	}

	@After("embark()")
	public void singAfterQuest() {
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}

}
