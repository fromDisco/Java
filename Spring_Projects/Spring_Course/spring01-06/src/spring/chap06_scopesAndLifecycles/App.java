package spring.chap06_scopesAndLifecycles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chap06_bean-scope_applicationContext.xml");
		RaceBike bike01 = context.getBean("racebike01", RaceBike.class);
		RaceBike bike02 = context.getBean("racebike01", RaceBike.class);
		
		System.out.println("Pointing to the same object: " + (bike01 == bike02));
		System.out.println("Memory locaation bike01: " + bike01);
		System.out.println("Memory locaation bike02: " + bike02);
		System.out.println("Bean is singleton!"); 

		// Beans are scope Prototype
		RaceBike bike03 = context.getBean("racebike02", RaceBike.class);
		RaceBike bike04 = context.getBean("racebike02", RaceBike.class);
		
		System.out.println("\nPointing to the same object: " + (bike03 == bike04));
		System.out.println("Memory locaation bike03: " + bike03);
		System.out.println("Memory locaation bike04: " + bike04);
		System.out.println("Beans are 'scope=protoype'!"); 
		
		// while instantiating startUp method is called
		RaceBike bike05 = context.getBean("racebike03", RaceBike.class);
		

		// by closing context destroy method of bike05 is called
		// BUT: bean of 'scope=prototype' needs to implement DisposableBean as Interface
		context.close();
		System.out.println("\n# This is the end.");
	}
}
