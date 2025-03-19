package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.ArticleDTO;
import com.m25790353.newsapi.dto.EverythingRequestDTO;
import com.m25790353.newsapi.dto.ResponseDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;
import com.m25790353.newsapi.newsclient.NewsAPIClient;

import reactor.core.publisher.Mono;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsAPIClient newsAPIClient;
    private final MongoOperations mongoOperations;

    public NewsServiceImpl(NewsAPIClient newsAPIClient, MongoOperations mongoOperations) {
        this.newsAPIClient = newsAPIClient;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public Mono getHeadlineNews(TopHeadlinesRequestDTO request) {

        // ResponseDTO response = newsAPIClient.getHeadlines(request);
        // ArticleDTO[] articleArray = response.getArticles();
        // List<ArticleDTO> articles = new ArrayList<>(Arrays.asList(articleArray));
        // System.out.println("Number of headline articles to be added to the database:
        // " + articles.size());
        // for (ArticleDTO article : articles) {
        // // insert into the database
        // System.out.println("Article title: " + article.getTitle());
        //
        // mongoOperations.insert(article, "article");
        // System.out.println("Article title: " + article.getTitle());

        // }
        // return response;

        return null;
    }

    @Override
    public Mono<ResponseDTO> searchNews(EverythingRequestDTO request) {

        // ResponseDTO response = newsAPIClient.search(request);
        // ArticleDTO[] articleArray = response.getArticles();
        // List<ArticleDTO> articles = new ArrayList<>(Arrays.asList(articleArray));
        // System.out.println("Number of searched articles to be added to the database:
        // " + articles.size());
        // for (ArticleDTO article : articles) {
        // System.out.println(article);
        // // insert into the database
        // mongoOperations.insert(article, "article");

        // }
        // return response;
        return null;
    }
}
