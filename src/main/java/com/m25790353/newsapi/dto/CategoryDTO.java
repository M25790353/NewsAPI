package com.m25790353.newsapi.dto;

public enum CategoryDTO {

      BUSINESS("business"),
      ENTERTAINMENT("entertainment"),
      GENERAL_HEALTH("generalhealth"),
      SCIENCE("science"),
      SPORTS("sports"),
      TECHNOLOGY("technology");

      private final String value;

      CategoryDTO(String value) {
            this.value = value;
      }
}
