package se.irori.bank.rest.jobs.demoapp.repositories;
import org.springframework.data.repository.CrudRepository;

import se.irori.bank.rest.jobs.demoapp.domain.Book;

public interface BookRepository extends CrudRepository<Book , Long> {
    
}
