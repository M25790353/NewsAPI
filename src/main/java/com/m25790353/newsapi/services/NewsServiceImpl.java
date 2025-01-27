package com.m25790353.newsapi.services;

import com.m25790353.newsapi.newsclient.NewsAPIClient;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsAPIClient newsAPIClient;

    public NewsServiceImpl(NewsAPIClient newsAPIClient) {
        this.newsAPIClient = newsAPIClient;
    }
//    @Override
//    public Article[] getArticles() {
//        return new Article[0];
//    }

    @Override
    public String getNews() {

        return   newsAPIClient.getTopHeadlines();

        // return "testing 1234";
    }
}
