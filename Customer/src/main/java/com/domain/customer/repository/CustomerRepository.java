package com.domain.customer.repository;

import org.springframework.data.repository.CrudRepository;
import com.domain.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
