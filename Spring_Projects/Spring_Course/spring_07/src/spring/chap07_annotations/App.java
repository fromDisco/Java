package spring.chap07_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Plant oak01 = context.getBean("oaks", Oak.class);
		System.out.println(oak01.getWateringInterval());
		
		Plant rose01 = context.getBean("rose", Rose.class);
		System.out.println(rose01.getWateringInterval());
		context.close();
	}
}
