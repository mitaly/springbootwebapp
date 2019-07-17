package guru.springframework.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.domain.Author;
import guru.springframework.domain.Book;
import guru.springframework.repositories.AuthorRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData() {
		System.out.println("initData called");
		Book book1 = new Book();
		book1.setIsbn("2323");
		book1.setTitle("The subtle art of not giving a fuck");
		book1.setPublisher("HarperOne");
		
		Book book2 = new Book();
		book2.setIsbn("434");
		book2.setTitle("Rich dad poor dad");
		book2.setPublisher("Warner Books Ed");
		
		Author author1 = new Author();
		author1.setFirstName("Mark");
		author1.setLastName("Manson");
		author1.getBooks().add(book1);
		
		Author author2 = new Author();
		author2.setFirstName("Robert");
		author2.setLastName("Kiyoski");
		author2.getBooks().add(book2);
		
		authorRepository.save(author1);
		authorRepository.save(author2);
	}
}
