package spring.chap05_dependencyInjection;

public class FortuneTeller {
	// BadFortune or HappyFortune as object attribute
	private FortuneService fortuneService;
	
	public FortuneTeller() {
		System.out.println(this + " FortuneTeller default.");
	}
	
	public FortuneTeller(FortuneService fortune) {
		this.fortuneService = fortune;
		System.out.println(this + " FortuneTeller with parameter.");
	}

	public String getFortune() {
		return "the glassbowl says: " + fortuneService.getFortune();
	}

	public String toString() {
		return "FortuneTeller(" +
				"fortuneService: " + this.fortuneService +
				")";
	}

}
