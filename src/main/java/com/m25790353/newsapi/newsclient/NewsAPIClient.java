package com.m25790353.newsapi.newsclient;

import com.m25790353.newsapi.dto.EverythingRequestDTO;
import com.m25790353.newsapi.dto.ResponseDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;
import com.m25790353.newsapi.dto.TopHeadlinesRequestDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Client for querying the News API Org website.
 * URL <a href="https://newsapi.org">...</a>
 *
 */
@Component
public class NewsAPIClient {

        private final RestClient restClient;

        private static final String BASE_URL = "https://newsapi.org/v2";
        private static final String HEADLINES = "/top-headlines";
        private static final String SEARCH = "/everything";

        // should be stored in a property file
        private static final String NEWS_ORG_KEY = "0841f3bb00084d13ab37b5339cdfc045";
        private static final String API_KEY = "apiKey";

        // Keys common to both
        private static final String PAGE = "page";
        private static final String PAGE_SIZE = "pageSize";
        private static final String QUERY = "q";

        // Top Headline Request keys
        private static final String CATEGORY = "category";
        private static final String COUNTRY = "country";

        // Everything Request Keys
        private static final String DOMAINS = "domains";
        private static final String EXCLUDE_DOMAINS = "excludeDomains";
        private static final String FROM = "from";
        private static final String LANGUAGE = "language";
        private static final String SEARCH_IN = "searchIn";
        private static final String SOURCES = "sources";
        private static final String SORT_BY = "sortBy";
        private static final String TO = "to";

        public NewsAPIClient() {
                this.restClient = RestClient.create();
        }

        public ResponseDTO getHeadlines(TopHeadlinesRequestDTO request) {

                System.out.println("before getHeadlines");

                ResponseDTO response = restClient.get()
                                .uri(UriComponentsBuilder.fromUriString(BASE_URL)
                                                .path(HEADLINES)
                                                .queryParam(API_KEY, NEWS_ORG_KEY)
                                                .queryParamIfPresent(QUERY, Optional.ofNullable(request.getQuery()))
                                                .queryParamIfPresent(LANGUAGE,
                                                                Optional.ofNullable(request.getLanguage()))
                                                .queryParamIfPresent(PAGE, Optional.ofNullable(request.getPage()))
                                                .queryParamIfPresent(PAGE_SIZE,
                                                                Optional.ofNullable(request.getPageSize()))
                                                .queryParamIfPresent(CATEGORY,
                                                                Optional.ofNullable(request.getCategory()))
                                                .queryParamIfPresent(COUNTRY, Optional.ofNullable(request.getCountry()))
                                                .build()
                                                .toUri())
                                .accept(APPLICATION_JSON)
                                .retrieve()
                                .body(ResponseDTO.class);

                System.out.println("after getHeadlines");

                return response;

        }

        public ResponseDTO search(EverythingRequestDTO request) {

                System.out.println("before search");
                // GET
                // https://newsapi.org/v2/everything?domains=techcrunch.com,thenextweb.com&apiKey=API_KEY

                ResponseDTO response = restClient.get()
                                .uri(UriComponentsBuilder.fromUriString(BASE_URL)
                                                .path(SEARCH)
                                                .queryParam(API_KEY, NEWS_ORG_KEY)
                                                .queryParamIfPresent(SOURCES, Optional.ofNullable(request.getSources()))
                                                .queryParamIfPresent(QUERY, Optional.ofNullable(request.getQuery()))
                                                .queryParamIfPresent(LANGUAGE,
                                                                Optional.ofNullable(request.getLanguage()))
                                                .queryParamIfPresent(PAGE, Optional.ofNullable(request.getPage()))
                                                .queryParamIfPresent(PAGE_SIZE,
                                                                Optional.ofNullable(request.getPageSize()))
                                                .queryParamIfPresent(DOMAINS, Optional.ofNullable(request.getDomains()))
                                                .queryParamIfPresent(FROM, Optional.ofNullable(request.getFrom()))
                                                .queryParamIfPresent(TO, Optional.ofNullable(request.getTo()))
                                                .queryParamIfPresent(SORT_BY, Optional.ofNullable(request.getSortBy()))
                                                .queryParamIfPresent(EXCLUDE_DOMAINS,
                                                                Optional.ofNullable(request.getExcludeDomains()))
                                                .queryParamIfPresent(SEARCH_IN,
                                                                Optional.ofNullable(request.getSearchIn()))

                                                .build()
                                                .toUri())
                                .accept(APPLICATION_JSON)
                                .retrieve()
                                .body(ResponseDTO.class);

                System.out.println("after search");

                return response;
        }

}
