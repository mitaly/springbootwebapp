package guru.springframework.factory;

import guru.springframework.repositories.GreetingRepository;
import guru.springframework.services.GermanGreetingService;
import guru.springframework.services.GreetingService;
import guru.springframework.services.SpanishGreetingService;

public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;
	
	public GreetingServiceFactory(final GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String language) {
		switch (language) {
			case "spanish":
				return new SpanishGreetingService(greetingRepository);
			case "german":
				return new GermanGreetingService(greetingRepository);
			default:
				return new SpanishGreetingService(greetingRepository);
		}
	}
}
