package com.m25790353.newsapi.services;

import com.m25790353.newsapi.dto.EverythingRequestDTO;
import com.m25790353.newsapi.dto.ResponseDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;

import reactor.core.publisher.Mono;

public interface NewsService {

    public Mono<ResponseDTO> getHeadlineNews(TopHeadlinesRequestDTO request);

    public Mono<ResponseDTO> searchNews(EverythingRequestDTO request);

}
