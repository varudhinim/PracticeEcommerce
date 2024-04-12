package com.tom.ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Product {

    private long id;
    private String title;
    private double prodPrice;
    private String prodDesc;
    private String prodImg;
    private String prodOwner;


}
;