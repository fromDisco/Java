package spring.chap08_annotationInjections;

import org.springframework.stereotype.Component;

@Component
public class Africa implements Region {

	@Override
	public String getRegion() {
		return "Africa";
	}

}
