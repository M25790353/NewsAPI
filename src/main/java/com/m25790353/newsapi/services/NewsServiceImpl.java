package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.Response;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.newsclient.NewsAPIClient;
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
    public String  getHeadlinesNews(TopHeadlinesRequest request) {

        Response response =   newsAPIClient.getHeadlines(request);
        Article[] articleArray = response.getArticles();
        List<Article> articles = new ArrayList<>(Arrays.asList(articleArray));
        System.out.println("Number of headline articles to be added to the database: " +articles.size());
        for (Article article : articles) {
            //insert into the database
            System.out.println("Article title: " +article.getTitle());

            mongoOperations.insert(article, "article");
            System.out.println("Article title: " +article.getTitle());

        }
        return response.toString();



    }



    @Override
    public String searchNews(EverythingRequest request){

        Response response =   newsAPIClient.search(request);
        Article[] articleArray = response.getArticles();
        List<Article> articles = new ArrayList<>(Arrays.asList(articleArray));
        System.out.println("Number of searched articles to be added to the database: " +articles.size());
        for (Article article : articles) {
            System.out.println(article);
            //insert into the database
            mongoOperations.insert(article, "article");

        }
        return response.toString();
    }
}
