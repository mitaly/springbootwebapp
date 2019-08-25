package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;

public class GermanGreetingService extends GreetingService {

	private GreetingRepository greetingRepository;
	
	public GermanGreetingService(final GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	@Override
	public void greet() {
		System.out.println("German greeting");
	}

}
