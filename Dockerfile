FROM amazoncorretto:11
VOLUME /tmp
COPY build/libs/capstone-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
