package spring.chap05_dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FortuneTeller mageGood = context.getBean("happyFortuneTeller", FortuneTeller.class);
		FortuneTeller mageBad = context.getBean("badFortuneTeller", FortuneTeller.class);
		
		System.out.println(mageGood.getFortune());
		System.out.println(mageBad.getFortune());
		
		// Setter Demo
		Cartomancer cartomancer = context.getBean("myCartomancer", Cartomancer.class);
		System.out.println(cartomancer.getFortune());
		System.out.println(cartomancer.getEmail());
		context.close();

	}

}
