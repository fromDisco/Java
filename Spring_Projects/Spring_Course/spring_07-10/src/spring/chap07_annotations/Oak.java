package spring.chap07_annotations;

import org.springframework.stereotype.Component;

@Component("oaks")
public class Oak implements Plant {
	private int wateringInterval;

	public Oak() {
		this.wateringInterval = 3;
	}

	// Getters / Setters
	public int getWateringInterval() {
		return this.wateringInterval;
	}
}
