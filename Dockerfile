FROM openjdk:11-jre

# copy the packaged jar file into our docker image
COPY lib/ratings-data-service-0.0.1-SNAPSHOT.jar /ratings-data-service.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/ratings-data-service.jar"]