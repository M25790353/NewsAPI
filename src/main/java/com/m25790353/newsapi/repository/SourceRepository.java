package com.m25790353.newsapi.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.m25790353.newsapi.domain.Source;

public interface SourceRepository extends ReactiveMongoRepository<Source, String>{

}
