package com.tom.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private long prodId;
    private String prodName;
    private double prodPrice;
    private String prodDesc;
    private String prodImg;
    private String prodOwner;


}
;