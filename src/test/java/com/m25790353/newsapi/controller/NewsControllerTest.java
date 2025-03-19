package com.m25790353.newsapi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.m25790353.newsapi.dto.ArticleDTO;
import com.m25790353.newsapi.dto.EverythingRequestDTO;
import com.m25790353.newsapi.dto.ResponseDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;
import com.m25790353.newsapi.services.NewsService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
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

        ResponseDTO response;
        ArticleDTO article1;
        ArticleDTO article2;
        ArticleDTO[] articles;

        @BeforeEach
        void before() {
                article1 = ArticleDTO.builder().description("First article").build();
                article2 = ArticleDTO.builder().description("Second article").build();
                articles = new ArticleDTO[] { article1, article2 };

                response = ResponseDTO.builder().articles(articles).build();

        }

        @Test
        void testGetHeadlineNews() throws Exception {

                TopHeadlinesRequestDTO topHeadlinesRequest = TopHeadlinesRequestDTO.builder()
                                .build();

                when(newsService.getHeadlineNews(any(TopHeadlinesRequestDTO.class)))
                                .thenReturn(objectMapper.writeValueAsString(response));

                mockMvc.perform(get(NewsController.HEADLINES)
                                .accept(MediaType.APPLICATION_JSON)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(topHeadlinesRequest)))
                                .andExpect(status().isOk())
                                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                                .andExpect(jsonPath("$.articles", hasSize(2)))
                                .andExpect(jsonPath("$.articles[0].description", is(article1.getDescription())));

                ArgumentCaptor<TopHeadlinesRequestDTO> headlineRequestCaptor = ArgumentCaptor
                                .forClass(TopHeadlinesRequestDTO.class);
                verify(newsService).getHeadlineNews(headlineRequestCaptor.capture());
                assertThat(topHeadlinesRequest).isEqualTo(headlineRequestCaptor.getValue());
        }

        @Test
        void testSearchNews() throws Exception {

                EverythingRequestDTO everythingRequest = EverythingRequestDTO.builder()
                                .build();

                when(newsService.searchNews(any(EverythingRequestDTO.class)))
                                .thenReturn(objectMapper.writeValueAsString(response));

                mockMvc.perform(get(NewsController.SEARCH)
                                .accept(MediaType.APPLICATION_JSON)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(everythingRequest)))
                                .andExpect(status().isOk())
                                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                                .andExpect(jsonPath("$.articles", hasSize(2)))
                                .andExpect(jsonPath("$.articles[0].description", is(article1.getDescription())));

                ArgumentCaptor<EverythingRequestDTO> everythingRequestCaptor = ArgumentCaptor
                                .forClass(EverythingRequestDTO.class);
                verify(newsService).searchNews(everythingRequestCaptor.capture());
                assertThat(everythingRequest).isEqualTo(everythingRequestCaptor.getValue());
        }
}
