package spring.chap09_scopeLifecyle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Pine pine = context.getBean("pine", Pine.class);
		Fir fir = context.getBean("fir", Fir.class);
		fir.setNumOfBranches(9);
		pine.setNumOfBranches(99);
		System.out.println(fir.getNumOfBranches());
		System.out.println(pine.getNumOfBranches());
		
		context.close();
	}

}
