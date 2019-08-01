package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.services.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;
	
	@GetMapping(value="greet")
	public void greet() {
		greetingService.greet();
	}
}
