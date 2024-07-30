package pl.piomin.microservices.advanced.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pl.piomin.microservices.advanced.customer.model.Customer;

import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByPesel(String pesel);

    public Optional<Customer> findByUsername(String username);

}
