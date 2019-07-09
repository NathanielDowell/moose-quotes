package com.example.moosequotesgenerator.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "moose_quotes")
public class Quote {

    @Id
    @GeneratedValue
    private long id;

    @Column (nullable = false)
    private String quote;

    @Column
    private boolean approved;

    @ManyToOne
    @JsonManagedReference
    private User author;

    public Quote() {

    }

    public Quote (String user) {

    }







}
