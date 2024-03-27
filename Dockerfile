FROM amazoncorretto:17
ADD target/movies-api-1.0.0-SNAPSHOT.jar movies-api-1.0.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","movies-api-1.0.0-SNAPSHOT.jar"]