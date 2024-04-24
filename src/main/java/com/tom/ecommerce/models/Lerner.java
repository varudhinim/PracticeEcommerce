package com.tom.ecommerce.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Lerner extends user{
    private String University;
    private double psp;

}
