package com.springFramework.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {

	public static void main(String[] args) {

		// load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("cyclingCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		Coach theCoach2 = context.getBean("trackCoach", Coach.class);
		System.out.println(theCoach2.getDailyWorkout());
		
		context.close();
	}

}
