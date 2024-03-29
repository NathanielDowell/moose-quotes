package com.example.moosequotesgenerator.repositories;

import com.example.moosequotesgenerator.models.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {
}
