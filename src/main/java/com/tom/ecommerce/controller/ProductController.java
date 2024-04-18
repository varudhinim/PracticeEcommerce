package com.tom.ecommerce.controller;

import com.tom.ecommerce.Dto.GetproductDto;
import com.tom.ecommerce.Service.ProductService;
import com.tom.ecommerce.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    private ProductService prds;

    public ProductController(ProductService ps) {
        this.prds = ps;
    }

    @GetMapping("/{id}/{name}")
    public String getproductByIdAndName(@PathVariable("id") Long id, @PathVariable("name") String name){
        return "HERE is the path Variable We are getting from the  URL : " + id +
                " I am also getting name from URL : " + name;
    }

    @GetMapping("/{id}")
    public @ResponseBody GetproductDto getProductById(@PathVariable("id") Long id){
        return prds.getProductById(id);
    }

    @PostMapping("/Hi")
    public String creatProduct(@RequestBody Product pr){
        System.out.println(pr.getDescription());
        System.out.println(pr.getPrice());
        System.out.println(pr.getName());
        return "Product created with Request Body";
    }

}
