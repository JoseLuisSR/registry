package com.domain.customer.controller;

import com.domain.customer.entity.Customer;
import com.domain.customer.repository.CustomerRepository;
import com.domain.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "${customer.context.path}")
public class CustomerController {

    /**
     * This is autogenerated by Spring.
     */
    @Autowired
    private CustomerService customerService;


    @GetMapping(path = "${customer.getByKey}")
    public @ResponseBody Optional<Customer> getByKey(@PathVariable("key") Integer id){

        return customerService.findById(id);
    }

    @GetMapping(path = "${customer.getAll}")
    public @ResponseBody Iterable<Customer> getAll(){

        return customerService.findAll();
    }

    /**
    @PostMapping(value = "${customer.add}", consumes = "application/json", produces = "application/json")
    public Customer addCustomer(@RequestBody Customer customer){

        return new Customer(customer.getKey(), customer.getFirstName(), customer.getLastName());
    }
    **/
}
