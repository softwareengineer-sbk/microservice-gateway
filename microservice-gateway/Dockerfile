#Start with a base image containing Java runtime
FROM openjdk:17-oracle as build

#Information aroung who maintains the image
MAINTAINER khalimboevsardorbek@gmail.com

#Add the application`s jar to the container
COPY target/microservice-gateway-1.0-SNAPSHOT.jar microservice-gateway-1.0-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "/microservice-gateway-1.0-SNAPSHOT.jar"]