package com.m25790353.newsapi.mappers;

import org.mapstruct.Mapper;

import com.m25790353.newsapi.domain.Article;
import com.m25790353.newsapi.dto.ArticleDTO;

@Mapper
public interface ArticleMapper {

    ArticleDTO articlerToArticleDto(Article article);

    

}
