package com.domain.product.controller;

import com.domain.product.entity.Product;
import com.domain.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${products.context.path}")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "${products.getAll}")
    public @ResponseBody Iterable<Product> getAll(){

        return productService.getAll();
    }
}
