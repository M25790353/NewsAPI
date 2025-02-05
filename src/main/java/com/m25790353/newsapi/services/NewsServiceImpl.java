package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.Response;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.newsclient.NewsAPIClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsAPIClient newsAPIClient;

    public NewsServiceImpl(NewsAPIClient newsAPIClient) {
        this.newsAPIClient = newsAPIClient;
    }


    @Override
    public String  getHeadlinesNews(TopHeadlinesRequest request) {

        Response response =   newsAPIClient.getHeadlines(request);
        Article[] articleArray = response.getArticles();
        List<Article> articles = new ArrayList<>(Arrays.asList(articleArray));
        System.out.println("Number of headline articles: " +articles.size());
        for (Article article : articles) {
            System.out.println(article);
            //insert into the database
        }
        return response.toString();



    }



    @Override
    public String searchNews(EverythingRequest request){

        Response response =   newsAPIClient.search(request);
        Article[] articleArray = response.getArticles();
        List<Article> articles = new ArrayList<>(Arrays.asList(articleArray));
        System.out.println("Number of searched articles: " +articles.size());
        for (Article article : articles) {
            System.out.println(article);
            //insert into the database
        }
        return response.toString();
    }
}
