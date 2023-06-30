package spring.chap08_annotationInjections;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomPlant implements Plant {
	private int[] wateringInterval = {1, 2, 3, 4};
	private Region region;

	// value is defined in color.properties file
	@Value("${plant.red}")
	private String color;
	
	// create a random number generator
	private Random random = new Random();
	
	// Constructors
	@Autowired
	public RandomPlant() {
		this.region = new Asia();
	}

	// Getters / Setters
	@Override
	public int getWateringInterval() {
		// get random number between 0 and wateringInterval.length
		int index = random.nextInt(wateringInterval.length);
		int interval = this.wateringInterval[index];
		return interval;
	}

	@Override
	public String getRegion() {
		return this.region.getRegion();
	}
	
	public String getColor() {
		return this.color;
	}
}
