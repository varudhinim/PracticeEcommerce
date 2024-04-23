package com.tom.ecommerce.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class user {

    private long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

}
