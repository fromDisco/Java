package spring.chap05_dependencyInjection;

public class Cartomancer {

	// BadFortune or HappyFortune as object attribute
	private FortuneService fortuneService;
	private String email;
	private int number;
	
	// Constructors
	public Cartomancer() {
		System.out.println(this + " Cartomancer default.");
	}

	public Cartomancer(FortuneService fortune) {
		this.fortuneService = fortune;
		System.out.println(this + " Cartomancer with parameter.");
	}
	
	// Getters / Setters
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getFortune() {
		return "the cards say:" + fortuneService.getFortune();
	}
	
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String toString() {
		return "Cartomancer(" +
				"fortuneService: " + this.fortuneService + ", " +
				"email: " + this.email + ", " +
				"number: " + this.number + 
				")";
	}

}
