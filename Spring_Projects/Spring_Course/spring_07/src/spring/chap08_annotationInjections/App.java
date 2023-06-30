package spring.chap08_annotationInjections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Beech beech = context.getBean("beech", Beech.class);
		String region = beech.getRegion();
		int waterInterval = beech.getWateringInterval();
		System.out.println("Constructor Injection: Plant is based in " + region + " and has to be watered every " + waterInterval + " days.");
		
		Peach peach01 = context.getBean("peach", Peach.class);
		String regionPeach = peach01.getRegion();
		int waterIntervalPeach = peach01.getWateringInterval();
		System.out.println("\nMethod Injection: Plant is based in " + regionPeach + " and has to be watered every " + waterIntervalPeach + " days.");

		Cherry cherry = context.getBean("cherry", Cherry.class);
		String cherryRegion = cherry.getRegion();
		int waterIntervalCherry = cherry.getWateringInterval();
		System.out.println("\nField Injection: Plant is based in " + cherryRegion + " and has to be watered every " + waterIntervalCherry + " days.");

		RandomPlant randomPlant = context.getBean("randomPlant", RandomPlant.class);
		String randomPlantRegion = randomPlant.getRegion();
		int waterIntervalRandomPlant = randomPlant.getWateringInterval();
		String color = randomPlant.getColor();
		System.out.println("\nRandom generated Interval, color is taken from file color.properties: \nPlant is based in " + randomPlantRegion + " and has to be watered every " + waterIntervalRandomPlant + " days.Further information: " + color );



		context.close();
	}
}
