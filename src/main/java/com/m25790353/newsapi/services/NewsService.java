package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;


public interface NewsService {


    public String getHeadlineNews(TopHeadlinesRequest request);

    public String searchNews(EverythingRequest request);

}
