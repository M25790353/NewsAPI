package com.m25790353.newsapi.controller;

import com.m25790353.newsapi.dto.EverythingRequestDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;
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

    public static final String HEADLINES = "/headlines";
    public static final String SEARCH = "/search";

    private final NewsService newsService;
    public static final Logger log = Logger.getLogger(NewsController.class.getName());

    @GetMapping(HEADLINES)
    public String getHeadlineNews(@RequestBody TopHeadlinesRequestDTO request) {
        return newsService.getHeadlineNews(request);

    }

    @GetMapping(SEARCH)
    public String searchNews(@RequestBody EverythingRequestDTO request) {
        return newsService.searchNews(request);

    }

}
