package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value="german")
public class GermanGreetingService extends GreetingService {

	@Override
	public void greet() {
		System.out.println("German greeting");
	}

}
