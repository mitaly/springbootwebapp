package guru.springframework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.factory.GreetingServiceFactory;
import guru.springframework.repositories.GreetingRepository;
import guru.springframework.services.GreetingService;

@Configuration
public class GreetingConfig {
	@Bean
	public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}
	
	@Profile("spanish")
	@Bean
	public GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("spanish");
	}
	
	@Profile("german")
	@Bean
	public GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("german");
	}
}
