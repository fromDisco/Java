package spring.chap08_annotationInjections;

import org.springframework.stereotype.Component;

@Component
public class Asia implements Region {

	@Override
	public String getRegion() {
		return "Asia";
	}

}
