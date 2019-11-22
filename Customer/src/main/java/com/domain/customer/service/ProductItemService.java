package com.domain.customer.service;

import com.domain.customer.entity.ProductItem;
import com.domain.customer.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductItemService {

    @Autowired
    private ProductItemRepository productItemRepository;

    public Iterable<ProductItem> getAll(){
        return productItemRepository.findAll();
    }

    public Optional<ProductItem> findByKey(Integer id){
        return productItemRepository.findById(id);

    }

    public Iterable<ProductItem> getByProductId(Integer productId){
        return productItemRepository.findByProductId(productId);
    }

}
