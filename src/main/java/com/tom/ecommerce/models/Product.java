package com.tom.ecommerce.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class Product {
@Id
    private long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    private String seller;
}
;