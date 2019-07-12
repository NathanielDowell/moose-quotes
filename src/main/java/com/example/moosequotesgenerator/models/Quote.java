package com.example.moosequotesgenerator.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "moose_quotes")
public class Quote {

    @Id
    @GeneratedValue
    private long id;

    @Column (nullable = false, unique = true)
    private String quote;

//    @Column
//    private boolean approved;

    @ManyToOne
    @JsonManagedReference
    private User author;

    public Quote() {

    }

    public Quote (String user) {

    }


    public long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public User getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
