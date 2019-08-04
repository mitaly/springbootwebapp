package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value="spanish")
public class SpanishGreetingService extends GreetingService {

	@Override
	public void greet() {
		System.out.println("Spanish Greeting");
	}

}
