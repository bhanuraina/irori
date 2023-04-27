package se.irori.bank.rest.jobs.demoapp.services;

import org.springframework.stereotype.Service;

import se.irori.bank.rest.jobs.demoapp.domain.Book;
import se.irori.bank.rest.jobs.demoapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{

    private  final BookRepository bookRepository;
    
    public BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @Override
	public Iterable<Book> findall()
	{
		return bookRepository.findAll();
	}
}