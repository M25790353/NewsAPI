package com.m25790353.newsapi.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

 //   @Bean
 //   MongoClient mongoClient() {
 //       return MongoClients.create("mongodb://mongodb-service.default:27017");
 //   }
    // uses DNS in k8S.
    // MongoClient mongoClient() {return
    // MongoClients.create("mongodb://mongodb-service.default:27017");}

    // the host.docker.internal is needed when the app is in the container and the
    // MongoDB is hosted on the machine.
    // MongoClient mongoClient() {
    // return MongoClients.create("mongodb://host.docker.internal:27017");
    // }
  //  @Bean
  //  MongoOperations mongoTemplate(MongoClient mongoClient) {
  //      return new MongoTemplate(mongoClient, "newsarticles");
  //  }
}
