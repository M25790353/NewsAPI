package com.m25790353.newsapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
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