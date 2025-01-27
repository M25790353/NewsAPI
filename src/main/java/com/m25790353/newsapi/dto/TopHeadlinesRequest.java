package com.m25790353.newsapi.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TopHeadlinesRequest {
    private String category;
    private String sources;
    private String query;
    private String pageSize;
    private String page;
    private String country;
    private String language;

}
