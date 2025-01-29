package com.m25790353.newsapi.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Article {

    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urtToImage;
    private String publishedAt;
    private String content;
}