package com.tom.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Batch {
    @Id
    private Long batchId;
    private String name;
    private Integer strength;
    @ManyToOne
    private Instructor instructor;
}
