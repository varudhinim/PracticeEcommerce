package com.tom.ecommerce.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Product {

    private long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    private String seller;
}
;