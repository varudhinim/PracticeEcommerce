package com.tom.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Orders")
public class OrderController {


    @GetMapping("")
    public String getOrders(){
        return "I am from the Order Controller";
    }

    @GetMapping("/HI")
    public String addOrder(){
        return "I am from another getMapping from order Controller";
    }
}
