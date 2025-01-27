package com.m25790353.newsapi.newsclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class NewsAPIClient {

    private RestClient restClient = RestClient.create();

    private final String BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=0841f3bb00084d13ab37b5339cdfc045";

    public String getTopHeadlines() {

        try {
            System.out.println("before getTopHeadlines");
            String response = restClient.get()
                    .uri(BASE_URL)
                    .retrieve()
                    .body(String.class);

            System.out.println("after getTopHeadlines");
            System.out.println(" response: " + response);
            return response;


        } catch (Exception e) {
            System.out.println("exception: " + e);


            e.printStackTrace();
            return null;

        }

    }
}
