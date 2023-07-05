package spring.chap10_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
// @ComponentScan("spring.chap10_javaConfig")
@PropertySource("spring/chap10_javaConfig/plant.properties")
public class PlantConfig {

	// define bean for watering example
	@Bean
	public WateringInstructions notMuchCareNeeded() {
		return new WateringInstructions(4, 1);
	}
	
	@Bean
	public Strawberry strawberryNo01() {
		return new Strawberry(5, this.notMuchCareNeeded());
	}

}
