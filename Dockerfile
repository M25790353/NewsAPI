# Opensoure and free Java image
FROM amazoncorretto:21

WORKDIR /app

COPY pom.xml .

COPY ./target/NewsAPI-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "NewsAPI-0.0.1-SNAPSHOT.jar"]