package com.tom.ecommerce.controller;

import com.tom.ecommerce.entity.Product;
import com.tom.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce/product")
public class ProductController {

    //@Autowired
    ProductService ps=new ProductService();

    @GetMapping("/print")
    public Product getProduct(@RequestBody Product p) {
        return p;
    }

    @GetMapping("/all")
    public List<Product> getProducts() {
        return ps.getProductList();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        Product p = ps.getProductById(id);
        return p;
    }

}
