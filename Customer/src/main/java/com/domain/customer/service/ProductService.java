package com.domain.customer.service;

import com.domain.customer.entity.Product;
import com.domain.customer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> findByKey(Integer id){
        return productRepository.findById(id);
    }

    public Iterable<Product> getAll(){
        return productRepository.findAll();
    }
}
