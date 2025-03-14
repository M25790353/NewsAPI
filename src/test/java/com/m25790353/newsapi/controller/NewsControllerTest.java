package com.m25790353.newsapi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.m25790353.newsapi.dto.Article;
import com.m25790353.newsapi.dto.EverythingRequest;
import com.m25790353.newsapi.dto.Response;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import com.m25790353.newsapi.services.NewsService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@WebMvcTest(NewsController.class)
public class NewsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;


@MockitoBean
NewsService newsService;

Response response;
Article article1;
Article article2;
Article[] articles;

@BeforeEach
void before(){
     article1 =   Article.builder().description("First article").build();
     article2 =   Article.builder().description("Second article").build();
    articles = new Article[] {article1, article2};

          
     response = Response.builder().articles(articles).build();

}

    @Test
    void testGetHeadlineNews() throws Exception  {

       
        TopHeadlinesRequest topHeadlinesRequest = 
           TopHeadlinesRequest.builder()
           .build();

       

        when(newsService.getHeadlineNews(any(TopHeadlinesRequest.class))).thenReturn(objectMapper.writeValueAsString(response));

        mockMvc.perform(get("/headlines")
        .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(topHeadlinesRequest)))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.articles", hasSize(2)))
        .andExpect(jsonPath("$.articles[0].description",is(article1.getDescription())));
    }
    
    @Test
    void testSearchNews() throws Exception  {
    
        EverythingRequest everythingRequest = 
        EverythingRequest.builder()
        .build();

        when(newsService.searchNews(any(EverythingRequest.class))).thenReturn(objectMapper.writeValueAsString(response));

        mockMvc.perform(get("/search")
        .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(everythingRequest)))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.articles", hasSize(2)))
        .andExpect(jsonPath("$.articles[0].description",is(article1.getDescription())));
    
    }
}
