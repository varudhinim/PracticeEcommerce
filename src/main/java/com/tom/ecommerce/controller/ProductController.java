package com.tom.ecommerce.controller;

import com.tom.ecommerce.dto.ProductDTO;
import com.tom.ecommerce.entity.Product;
import com.tom.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce/product")
public class ProductController {

    ProductService ps;
    public ProductController(ProductService ps) {  //constructor based injection
        this.ps = ps;
    }

    @GetMapping("/print")
    public Product getProduct(@RequestBody Product p) {
        return p;
    }

    @GetMapping("/all")
    public List<ProductDTO> getProducts() {
        return ps.getProductList();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable("id") long id) throws Exception {
          return  ps.getProductById(id);
    }

}
