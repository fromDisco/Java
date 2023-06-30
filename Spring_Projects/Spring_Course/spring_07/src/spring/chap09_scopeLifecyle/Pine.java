package spring.chap09_scopeLifecyle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Pine {
	private int numOfBranches;
	
	// Constructors
	public Pine(int numOfBranches) {
		this.numOfBranches = numOfBranches;
	}

	// Setters / Getters
	public int getNumOfBranches() {
		return this.numOfBranches;
	}

	// utility methods
	@PostConstruct
	private void atStartUp() {
		System.out.println("# Start up done.");
	}
	
	@PreDestroy
	private void atDestruction() {
		System.out.println("# About to be destroyed.");
	}
}
