package spring.chap05_dependencyInjection;

public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is your happy day";
	}

}
