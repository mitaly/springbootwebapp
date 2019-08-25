package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;

public class SpanishGreetingService extends GreetingService {

	private GreetingRepository greetingRepository;
	
	public SpanishGreetingService(final GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	@Override
	public void greet() {
		System.out.println("Spanish Greeting");
	}

}
