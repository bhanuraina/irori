package se.irori.bank.rest.jobs.demoapp.repositories;
import se.irori.bank.rest.jobs.demoapp.domain.Publisher;

import org.springframework.data.repository.CrudRepository;
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
    
}
