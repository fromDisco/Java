package spring.chap06_scopesAndLifecycles;

import org.springframework.beans.factory.DisposableBean;

public class RaceBike implements Bike, DisposableBean {
	private String type;
	private String brand;
	
	public RaceBike() {
		
	}
	
	// Constructors
	public RaceBike(int wheelsnumber, String type, String brand) {
		this.type = type;
		this.brand = brand;
	}

	// Setters / Getters
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// add an init method
	public void startUp() {
		System.out.println("# Starting up my object:");
	}

	// add a destroy method
	public void destroy() {
		System.out.println("# Exterminate, Exterminate");
	}
	
}
