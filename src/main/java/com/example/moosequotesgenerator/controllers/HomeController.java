package com.example.moosequotesgenerator.controllers;


import com.example.moosequotesgenerator.repositories.QuoteRepository;
import com.example.moosequotesgenerator.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private QuoteRepository quotesDao;
    private UserRepository userDao;

    @GetMapping ("")
    public String returnHomePage(Model model) {

    return "home";
    }
}
