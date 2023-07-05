package spring.chap09_scopeLifecyle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Fir implements Plant {

	private int numOfBranches;
	
	// Constructors
	public Fir() {
	}

	// Setters / Getters
	public int getNumOfBranches() {
		return this.numOfBranches;
	}
	
	public void setNumOfBranches(int num) {
		this.numOfBranches = num;
	}

	// utility methods
	@PostConstruct
	private void atStartUp() {
		System.out.println("# Fir: Start up done.");
	}
	
	@PreDestroy
	private void atDestruction() {
		System.out.println("# Fir: About to be destroyed.");
	}
}
