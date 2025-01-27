package com.m25790353.newsapi.dto;

public enum Category {

     BUSINESS ("business"), ENTERTAINMENT("entertainment"), GENERAL_HEALTH ("generalhealth"),  SCIENCE("science"), SPORTS("sports"), TECHNOLOGY("technology");

    private final String value;
    Category(String value){
          this.value = value;
    }
}
