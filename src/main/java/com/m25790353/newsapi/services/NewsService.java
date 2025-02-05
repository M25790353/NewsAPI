package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;

import java.util.List;

public interface NewsService {


    public String getHeadlinesNews(TopHeadlinesRequest request);

    public String searchNews(EverythingRequest request);

}
