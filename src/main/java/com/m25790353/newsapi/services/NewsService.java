package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.EverythingRequestDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;

public interface NewsService {

    public String getHeadlineNews(TopHeadlinesRequestDTO request);

    public String searchNews(EverythingRequestDTO request);

}
