package com.example.moosequotesgenerator.controllers;

import com.example.moosequotesgenerator.models.Quote;
import com.example.moosequotesgenerator.repositories.QuoteRepository;
import com.example.moosequotesgenerator.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuoteController {

    private QuoteRepository quotesDao;
    private UserRepository userDao;

    public QuoteController(QuoteRepository quotesDao) {
        this.quotesDao = quotesDao;
    }

    @GetMapping("quotes.json")
    public @ResponseBody List<Quote> viewAllQuotesInJSONFormat() {
        return (List<Quote>) quotesDao.findAll();
    }

    @GetMapping("quotes/ajax")
    public String viewAllQuotesWithAjax() {
        return "ads/ajax";
    }

}
