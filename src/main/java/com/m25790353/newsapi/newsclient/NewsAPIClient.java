package com.m25790353.newsapi.newsclient;

import com.m25790353.newsapi.dto.EverythingRequest;
//import org.springframework.http.MediaType;
import com.m25790353.newsapi.dto.Response;
import com.m25790353.newsapi.dto.TopHeadlinesRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class NewsAPIClient {

    private final RestClient restClient;

    private static final String NEWS_ORG_KEY = "0841f3bb00084d13ab37b5339cdfc045";

  //  private final String BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" +NEWS_ORG_KEY;
    private static final String BASE_URL = "https://newsapi.org/v2" ;
 private static final String HEADLINES = "/top-headlines";

    public NewsAPIClient() {
        this.restClient = RestClient.create();
    }


    public Response getTopHeadlines() {

        String query;
        try {
            System.out.println("before getTopHeadlines");

        // query =  topHeadlinesRequest.getQuery();
            String paramaters = "?country=us&category=business";
            // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=API_KEY

            String sender = BASE_URL +HEADLINES +paramaters +"&apiKey=" +NEWS_ORG_KEY;
            System.out.println("sender: " +sender);

            Response response = restClient.get()
                    .uri(BASE_URL +HEADLINES +paramaters +"&apiKey=" +NEWS_ORG_KEY)
                    .accept(APPLICATION_JSON)
                    .retrieve()
                    .body(Response.class);

            System.out.println("after getTopHeadlines");
            return response;


        } catch (Exception e) {
            System.out.println("exception: " + e);


            e.printStackTrace();
            return null;

        }

    }


        // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=API_KEY
        // GET https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=API_KEY
       // GET https://newsapi.org/v2/top-headlines?q=trump&apiKey=API_KEY


    /**  RestClient customClient = RestClient.builder()
            .requestFactory(new HttpComponentsClientHttpRequestFactory())
            .messageConverters(converters -> converters.add(new MyCustomMessageConverter()))
            .baseUrl("https://example.com")
            .defaultUriVariables(Map.of("variable", "foo"))
            .defaultHeader("My-Header", "Foo")
            .defaultCookie("My-Cookie", "Bar")
            .requestInterceptor(myCustomInterceptor)
            .requestInitializer(myCustomInitializer)
            .build();
**/
}
