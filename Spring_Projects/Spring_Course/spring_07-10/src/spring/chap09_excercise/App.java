package spring.chap09_excercise;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Region region = context.getBean("region", Region.class);
		context.close();
	}
}
