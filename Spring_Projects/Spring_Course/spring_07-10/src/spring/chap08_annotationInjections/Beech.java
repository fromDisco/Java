package spring.chap08_annotationInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// default bean name is camelCase name of Class
@Component
public class Beech implements Plant {
	private Region region;
	
	// Constructors
	// checks for Types that implement interface Region (for now only Europe)
	// and passes it as argument to Constructor
	// Qualifier is defining which Region implementing type to use -> "europe"
	// Qualifier must be next to paramter in Constructor
	@Autowired
	public Beech(@Qualifier("europe") Region region) {
		this.region = region;
	}

	// Getters / Setters
	@Override
	public int getWateringInterval() {
		return 3;
	}

	@Override
	public String getRegion() {
		return this.region.getRegion();
	}
	
	public void setRegion(Region region) {
		this.region = region;
	}

}
