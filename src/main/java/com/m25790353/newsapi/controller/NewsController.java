package com.m25790353.newsapi.controller;

import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.services.NewsService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Used to search the News API web service and store the records in the
 * database.
 */

@AllArgsConstructor
@RestController
public class NewsController {

    private final NewsService newsService;
    public static final Logger log = Logger.getLogger(NewsController.class.getName());

    @GetMapping("/headlines")
    public String getHeadlineNews(@RequestBody TopHeadlinesRequest request) {
        return newsService.getHeadlineNews(request);

    }

    @GetMapping("/search")
    public String searchNews(@RequestBody EverythingRequest request) {
        return newsService.searchNews(request);

    }

}
