package spring.chap09_scopeLifecyle;

import org.springframework.stereotype.Component;

@Component
public class Fir {

	private int numOfBranches;
	
	// Constructors
	public Fir(int numOfBranches) {
		this.numOfBranches = numOfBranches;
	}

	// Setters / Getters
	public int getNumOfBranches() {
		return this.numOfBranches;
	}

}
