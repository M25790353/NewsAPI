package com.m25790353.newsapi.controller;


import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.Response;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.services.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsAPIController {

    private final NewsService newsService;

    public NewsAPIController(NewsService newsService) {
        this.newsService = newsService;
    }

    // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=API_KEY
    // GET https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=API_KEY
    // GET https://newsapi.org/v2/top-headlines?q=trump&apiKey=API_KEY

    @GetMapping("/topheadlines")
    public String getHeadlineNews() {
        //first just work with a default query using top headlines
        Response response =  newsService.getNews();

        Article[] articles = response.getArticles();
        int numberOfArticles = articles.length;

        System.out.println("numberOfArticles: "  +numberOfArticles);
        System.out.println("length of array: "  +articles.length);

        for (int i = 0; i < numberOfArticles; i++) {
            System.out.println("******************** "  +i);
            System.out.println("\n");
            System.out.println(articles[i]);


        }
        System.out.println(response);
        return response.getStatus();
    }


}
