package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.repositories.BookRepository;

@Controller
public class BookController {	
	@Autowired
	BookRepository repository;
		
	@RequestMapping("/books")
	public String getAll(Model model) {
		model.addAttribute("books", repository.findAll());
		//return view name
		return "books";
	}
}
