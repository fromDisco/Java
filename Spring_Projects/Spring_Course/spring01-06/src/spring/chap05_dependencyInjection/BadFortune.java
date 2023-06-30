package spring.chap05_dependencyInjection;

public class BadFortune implements FortuneService {

	@Override
	public String getFortune() {

		return "today is you bad day";
	}

}
