package se.irori.bank.rest.jobs.demoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import se.irori.bank.rest.jobs.demoapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
