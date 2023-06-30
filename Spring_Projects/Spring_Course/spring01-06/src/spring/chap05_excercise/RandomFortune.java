package spring.chap05_excercise;

public class RandomFortune implements FortuneService {
	private String[] randomFortune = {"celebrate", "die", "be bored"};

	@Override
	public String getFortune() {
		return "You will " + this.getRandomFortune();
	}
	
	private String getRandomFortune() {
		int rand = (int)(Math.random() * 3);
		return this.randomFortune[rand];
	}

}
