package com.tom.ecommerce.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDto {

    private String username;
    private String password;
    private String email;


}
