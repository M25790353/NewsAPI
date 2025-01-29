package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.Response;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.newsclient.NewsAPIClient;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsAPIClient newsAPIClient;

    public NewsServiceImpl(NewsAPIClient newsAPIClient) {
        this.newsAPIClient = newsAPIClient;
    }


    @Override
    public Response getNews() {

        return   newsAPIClient.getTopHeadlines();


    }
}
