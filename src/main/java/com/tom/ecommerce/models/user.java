package com.tom.ecommerce.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.IdentityHashMap;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity(name= "ecomm_user")
public class user {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String username;
    private String password;
    @Column (name = "email_address", unique=true)
    private String email;
    private String phone;
    private String address;
}
