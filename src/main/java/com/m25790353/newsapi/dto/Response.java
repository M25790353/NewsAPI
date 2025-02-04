package com.m25790353.newsapi.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Response {

    private String status;
    private int totalResults;
    private Article[] articles;


    //issue with Lombock?

    public Article[] getArticles() {
        return articles;
    }

}
