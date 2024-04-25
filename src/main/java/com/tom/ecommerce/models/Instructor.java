package com.tom.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Instructor extends user {
    private Double salary;
    private String skills;
    @OneToMany(mappedBy = "instructor")
    private List<Batch> batch;
}
