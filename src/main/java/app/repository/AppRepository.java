package app.repository;

import app.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface AppRepository <Customer>{

    boolean create(app.domain.Customer customer);


    Optional<List<app.domain.Customer>> fetchAll();

    Optional<app.domain.Customer> fetchById(Long id);

    boolean update(Long id, app.domain.Customer customer);

    boolean delete(Long id);
}
