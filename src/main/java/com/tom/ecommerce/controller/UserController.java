package com.tom.ecommerce.controller;

import com.tom.ecommerce.Dto.UserDto;
import com.tom.ecommerce.Service.UserServices;
import com.tom.ecommerce.models.Instructor;
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
    public user CreateUser(@RequestBody UserDto users){
        return userService.CreateUser(users.getUsername(), users.getPassword(),users.getEmail());
    }

    @PostMapping("/instructor")
    public Instructor CreateInstructor(@RequestBody Instructor users){
        return userService.CreateInstructor(users.getUsername(), users.getPassword(),
                users.getEmail(),users.getSalary(),users.getSkills());
    }

    @GetMapping("/{username}")
    public List<user> GetUserBYName(@PathVariable String username){
        return userService.getUserByName(username);
    }
    @GetMapping("/instructor/{Name}")
    public List<Instructor> GetInstructorByName(@PathVariable String Name){
        return userService.getInByname(Name);
    }

}
