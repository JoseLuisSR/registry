package com.domain.customer.repository;

import com.domain.customer.entity.ProductItem;
import org.springframework.data.repository.CrudRepository;

public interface ProductItemRepository extends CrudRepository<ProductItem, Integer> {

    public Iterable<ProductItem> findByProductId(Integer productId);
}
