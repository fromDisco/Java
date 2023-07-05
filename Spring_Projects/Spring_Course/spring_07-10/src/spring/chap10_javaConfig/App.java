package spring.chap10_javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlantConfig.class);

		Strawberry instance = context.getBean("strawberryNo01", Strawberry.class);
		System.out.println(instance.getNumOfBranches());
		System.out.println(instance.getInstructions());
		System.out.println(instance.getEatable());
		System.out.println(instance.getColor());

		context.close();
	}

}
