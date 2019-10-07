package com.domain.customer.controller;

import com.domain.customer.common.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${customer.context.path}")
public class CustomerController {

    @GetMapping(value = "${customer.getByKey}", produces = "application/json")
    public Customer getCustomerByKey(@PathVariable("key") String key){

        return new Customer(key,"JoseLuis", "SR");
    }

    @PostMapping(value = "${customer.add}", consumes = "application/json", produces = "application/json")
    public Customer addCustomer(@RequestBody Customer customer){

        return new Customer(customer.getKey(), customer.getFirstName(), customer.getLastName());
    }
}
