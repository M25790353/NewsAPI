package com.m25790353.newsapi.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseDTO {

    private String status;
    private int totalResults;
    private ArticleDTO[] articles;

    public ArticleDTO[] getArticles() {
        return articles;
    }

}
