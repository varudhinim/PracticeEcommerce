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

    public Product() {}

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdImg() {
        return prodImg;
    }

    public void setProdImg(String prodImg) {
        this.prodImg = prodImg;
    }

    public String getProdOwner() {
        return prodOwner;
    }

    public void setProdOwner(String prodOwner) {
        this.prodOwner = prodOwner;
    }
}
;