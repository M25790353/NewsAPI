package com.m25790353.newsapi.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Generated;

@Builder
@Data
//@Document(collection = "article")
public class Article {

    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urtToImage;
    private String publishedAt;
    private String content;


    public Source getSource() {
        return this.source;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrtToImage() {
        return this.urtToImage;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public String getContent() {
        return this.content;
    }

    public void setSource(final Source source) {
        this.source = source;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setUrtToImage(final String urtToImage) {
        this.urtToImage = urtToImage;
    }

    public void setPublishedAt(final String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setContent(final String content) {
        this.content = content;
    }

}