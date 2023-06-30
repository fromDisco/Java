package spring.chap07_annotations;

import org.springframework.stereotype.Component;

// default bean name is camelCase name of Class
@Component
public class Rose implements Plant {
	private int wateringInterval;
	
	public Rose() {
		this.wateringInterval = 1; 
	}

	// Getters / Setters
	@Override
	public int getWateringInterval() {
		return this.wateringInterval;
	}

}
