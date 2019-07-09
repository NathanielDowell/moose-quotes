package com.example.moosequotesgenerator.controllers;

import com.example.moosequotesgenerator.models.User;
import com.example.moosequotesgenerator.repositories.UserRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    private UserRepository users;
//    private PasswordEncoder passwordEncoder; //provided by Spring Security

//    public UserController(UserRepository users, PasswordEncoder passwordEncoder) {
//        this.users = users;
//        this.passwordEncoder = passwordEncoder;
//    }

    public UserController(UserRepository users) { //no Spring Security
        this.users = users;
    }

    @GetMapping("create-account")
    public String showSignupForm(Model model){

        return "users/create-account";
    }

    @PostMapping("sign-up")
    public String saveUser(@ModelAttribute User user){
//        String hash = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hash);
        users.save(user);
        return "redirect:/login";
    }
}