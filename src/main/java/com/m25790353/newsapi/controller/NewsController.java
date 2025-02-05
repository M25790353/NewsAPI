package com.m25790353.newsapi.controller;


import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.services.NewsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * Used to search the News API web service and store the records in the database.
 */
@RestController
public class NewsController {

    private final NewsService newsService;
    public static final Logger log = Logger.getLogger(NewsController.class.getName());

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/headlines")
    public String getHeadlineNews(@RequestBody TopHeadlinesRequest request) {
     return   newsService.getHeadlinesNews(request);

    }

    @GetMapping("/search")
    public String searchNews(@RequestBody EverythingRequest request) {
        return newsService.searchNews(request);

    }

}
