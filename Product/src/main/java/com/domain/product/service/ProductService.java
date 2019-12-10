package com.domain.product.service;

import com.domain.product.entity.Product;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    public Iterable<Product> getAll(){
        Iterable<Product> products = new ArrayList<Product>();
        ((ArrayList<Product>) products).add(new Product("1", "Cereal", "Cereal",2.500));
        ((ArrayList<Product>) products).add(new Product("2", "Jabon", "Jabon",5.500));
        return  products;
    }

}
