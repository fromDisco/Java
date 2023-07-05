package spring.chap08_annotationInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Peach implements Plant {
	private int wateringInterval;
	private Region region;

	// Constructors
	public Peach() {
		this.wateringInterval = 1;
	}

	// Setters / Getters
	@Override
	public int getWateringInterval() {
		return this.wateringInterval;
	}

	@Override
	public String getRegion() {
		return this.region.getRegion();
	}

	// methods can also be autowired
	// Qualifier is defining which Region implementing type to use -> "asia"
	@Autowired
	@Qualifier("asia")
	public void setRegion(Region region) {
		this.region = region;
	}
}
