package se.irori.bank.rest.jobs.demoapp.bootstrap;

import se.irori.bank.rest.jobs.demoapp.domain.Publisher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import se.irori.bank.rest.jobs.demoapp.domain.Author;
import se.irori.bank.rest.jobs.demoapp.domain.Book;
import se.irori.bank.rest.jobs.demoapp.repositories.AuthorRepository;
import se.irori.bank.rest.jobs.demoapp.repositories.BookRepository;
import se.irori.bank.rest.jobs.demoapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository , PublisherRepository publisherRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("evans");
        
        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("12345557");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();

        rod.setFirstName("Rod");
        rod.setLastName("Johnsson");



        Book noEJB = new Book();
        noEJB.setTitle("JEE Development");
        noEJB.setIsbn("5474744");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBsaved = bookRepository.save(noEJB);

        Publisher publisher = new Publisher();

        publisher.setPublisherName("Oreilly");
        publisher.setAddress("Ohio");
        Publisher savedPublisher = publisherRepository.save(publisher);
        
        dddSaved.setPublisher(savedPublisher);
        noEJBsaved.setPublisher(savedPublisher);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBsaved);
        

        System.out.println("In BootStrap");
        System.out.println("Author Count: "+ authorRepository.count());
        System.out.println("Book Count: "+ bookRepository.count());

        
        System.out.println("Publisher Count: "+ publisherRepository.count());

    }
}
