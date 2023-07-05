package spring.chap10_javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Strawberry implements Plant {
	private int numOfBranches;
	private WateringInstructions instructions;

	// read data from properties file
	@Value("${strawberry.color}")
	private String color;
	@Value("${strawberry.eatable}")
	private String eatable; 

	// Constructors
	public Strawberry() {
		this.numOfBranches = 5; 
	}

	public Strawberry(int num, WateringInstructions instructions) {
		this.numOfBranches = num; 
		this.instructions = instructions;
	}

	// Setters / Getters
	@Override
	public int getNumOfBranches() {
		return this.numOfBranches;
	}

	public void setNumOfBranches(int num) {
		this.numOfBranches = num;
	}

	public WateringInstructions getInstructions() {
		return this.instructions;
	}

	public void setInstructions(WateringInstructions instructions) {
		this.instructions = instructions;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getEatable() {
		return this.eatable;
	}

}
