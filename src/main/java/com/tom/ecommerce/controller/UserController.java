package com.tom.ecommerce.controller;

import com.tom.ecommerce.Dto.UserDto;
import com.tom.ecommerce.Service.UserServices;
import com.tom.ecommerce.models.user;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServices userService;

    public UserController(UserServices userser) {
        this.userService = userser;
    }

    @PostMapping("")
    public user creatUser(@RequestBody UserDto users){
        return userService.CreateUser(users.getUsername(), users.getPassword(),users.getEmail());
    }

    /*@GetMapping("/")
    public List<user> getAllUsers(){

    }*/
    @GetMapping("/{username}")
    public List<user> getUserByName(@PathVariable String username){
        return userService.getuserByname(username);
    }

}
