package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.repositories.AuthorRepository;

@Controller
public class AuthorController {
	@Autowired
	AuthorRepository repository;
		
	@RequestMapping("/authors")
	public String getAll(Model model) {
		model.addAttribute("authors", repository.findAll());
		return "authors";
	}
}