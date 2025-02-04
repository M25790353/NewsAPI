package com.m25790353.newsapi.controller;


import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.services.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class NewsAPIController {

    private final NewsService newsService;
    public static final Logger log = Logger.getLogger(NewsAPIController.class.getName());

    public NewsAPIController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/topheadlines")
    public String getHeadlineNews(Model model) {

           List<Article> articles = newsService.geHeadlines();
           for (Article article : articles) {
                log.info(article.toString());
                System.out.println(article.toString());
           }

        model.addAttribute("article", articles);
        return "headlines";

    }

}
