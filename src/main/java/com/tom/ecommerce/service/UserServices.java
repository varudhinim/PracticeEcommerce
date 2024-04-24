package com.tom.ecommerce.Service;

import com.tom.ecommerce.Repository.UserRepository;
import com.tom.ecommerce.models.user;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public user CreateUser(String username, String password, String email ) {
        user user = new user();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        return userRepository.save(user);

    }

    public List<user> getuserByname(String username) {
        /*user user= new user();
        user.setUsername(username);*/

        for (user user : userRepository.findAll()) {
            if (user.getUsername().equals(username)) {
                return userRepository.findAll();
            }
        }
        return List.of();
    }
}
