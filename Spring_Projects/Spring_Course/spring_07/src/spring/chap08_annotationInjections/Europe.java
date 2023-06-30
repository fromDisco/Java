package spring.chap08_annotationInjections;

import org.springframework.stereotype.Component;

@Component
public class Europe implements Region {

	@Override
	public String getRegion() {
		return "Europe";
	}

}
