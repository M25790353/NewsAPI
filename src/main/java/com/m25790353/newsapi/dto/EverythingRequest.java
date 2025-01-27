package com.m25790353.newsapi.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EverythingRequest {

    private String query;
    private String sources;
    private String domains;
    private String from;
    private String to;
    private String language;
    private String sortBy;
    private String pageSize;
    private String page;
}
