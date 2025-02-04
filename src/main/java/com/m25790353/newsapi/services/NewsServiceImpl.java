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
    public List<Article>  geHeadlines() {

        Response response =   newsAPIClient.getTopHeadlines();
        Article[] articleArray = response.getArticles();
        List<Article> articles = new ArrayList<>(Arrays.asList(articleArray));
        System.out.println("size: " +articles.size());
        return articles;



    }
}
