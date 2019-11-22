package com.domain.customer.controller;

import com.domain.customer.entity.Product;
import com.domain.customer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "${product.context.path}")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "${product.getByKey}")
    public @ResponseBody Optional<Product> findByKey(@PathVariable Integer key){
        return productService.findByKey(key);
    }

    @GetMapping(path = "${product.getAll}")
    public @ResponseBody Iterable<Product> getAll(){
        return productService.getAll();
    }

}
