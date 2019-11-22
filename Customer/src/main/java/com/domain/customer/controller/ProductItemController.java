package com.domain.customer.controller;

import com.domain.customer.entity.ProductItem;
import com.domain.customer.service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "${product.item.context.path}")
public class ProductItemController {

    @Autowired
    private ProductItemService productItemService;

    @GetMapping(path = "product.item.getByKey}")
    public @ResponseBody Optional<ProductItem> getByKey(@PathVariable Integer key){

        return productItemService.findByKey(key);
    }

    @GetMapping(path = "${product.item.getAll}")
    public @ResponseBody Iterable<ProductItem> getAll(){
        return productItemService.getAll();
    }

    @GetMapping(path = "${product.item.getByProductId}")
    public @ResponseBody Iterable<ProductItem> getByProductId(@RequestParam Integer productId){
        return productItemService.getByProductId(productId);
    }

}
