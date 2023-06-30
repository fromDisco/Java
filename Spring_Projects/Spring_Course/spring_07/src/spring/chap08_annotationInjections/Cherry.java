package spring.chap08_annotationInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Cherry implements Plant {
	private int wateringInterval;

	// no setter required for autowired region
	// Qualifier is defining which Region implementing type to use -> "europe"
	@Autowired
	@Qualifier("europe")
	private Region region;
	
	public Cherry() {
		this.wateringInterval = 4;
	}

	@Override
	public int getWateringInterval() {
		return this.wateringInterval;
	}

	@Override
	public String getRegion() {
		return this.region.getRegion();
	}

}
