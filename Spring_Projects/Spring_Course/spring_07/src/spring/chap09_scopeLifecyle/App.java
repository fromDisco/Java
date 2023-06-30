package spring.chap09_scopeLifecyle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pine pine = context.getBean("pine", Pine.class);
		Fir fir = context.getBean("fir", Fir.class);
		
		context.close();
	}

}
