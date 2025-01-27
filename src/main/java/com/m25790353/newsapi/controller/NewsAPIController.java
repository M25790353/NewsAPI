package com.m25790353.newsapi.controller;


import com.m25790353.newsapi.services.NewsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsAPIController {

    private final NewsService newsService;

    public NewsAPIController(NewsService newsService) {
        this.newsService = newsService;
    }


    @RequestMapping("/topheadlines")
    public String getNews(){
        //first just work with a default query using top headlines
        return newsService.getNews();
        // return "topheadlines";
    }
}
