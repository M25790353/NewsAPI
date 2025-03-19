
package com.m25790353.newsapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TopHeadlinesRequestDTO {
    private String category;
    private String sources;
    private String query;
    private String pageSize;
    private String page;
    private String country;
    private String language;
    private String excludeDomains;
    private String searchIn;

}