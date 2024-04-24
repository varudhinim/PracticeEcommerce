package com.tom.ecommerce.Service;

import com.tom.ecommerce.Repository.InstructorRepository;
import com.tom.ecommerce.Repository.UserRepository;
import com.tom.ecommerce.models.Instructor;
import com.tom.ecommerce.models.user;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;
    private final InstructorRepository instructorRepository;


    public UserServices(UserRepository userRepository, InstructorRepository instructorRepository) {
        this.userRepository = userRepository;
        this.instructorRepository = instructorRepository;
    }

    public user CreateUser(String username, String password, String email ) {
        user user = new user();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        return userRepository.save(user);

    }


    public Instructor CreateInstructor(String username, String password, String email, Double salary,String skills ) {
        Instructor instructor = new Instructor();
        instructor.setUsername(username);
        instructor.setPassword(password);
        instructor.setEmail(email);
        instructor.setSalary(salary);
        instructor.setSkills(skills);

        return instructorRepository.save(instructor);

    }

    public List<user> getUserByName(String username){
        return userRepository.findByUsername(username);
    }

    public List<Instructor> getInByname(String username){
        return instructorRepository.findByUsername(username);
    }

}
