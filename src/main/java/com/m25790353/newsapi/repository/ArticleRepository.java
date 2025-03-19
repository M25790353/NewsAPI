package com.m25790353.newsapi.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.m25790353.newsapi.domain.Article;

public interface ArticleRepository extends ReactiveMongoRepository<Article, String>{

}
