package spring.chap10_javaConfig;

import java.util.Random;


public class WateringInstructions implements Watering {
	private int wateringInterval;
	private int waterQuantity;
	// create a random number generator
	private Random random = new Random();

	// Constructors
	public WateringInstructions() {
		
	}
	
	public WateringInstructions(int interval, int quantity) {
		this.wateringInterval = interval;
		this.waterQuantity = quantity;
	}

	// Getters / Setters
	@Override
	public int getWateringInterval() {
		return this.wateringInterval;
	}
	
	public void setWateringInverval(int interval) {
		// int num = random.nextInt(10);
		this.wateringInterval = interval;
	}

	@Override
	public int getWaterQuantity() {
		return this.waterQuantity;
	}
	
	public void setWaterQuantity(int quantity) {
		this.waterQuantity = quantity;
	}
	
	public String toString() {
		return "WateringInstructions(" +
				"wateringInterval: " + this.wateringInterval +
				", waterQuantity: " + this.waterQuantity +
				")";
	}

}
