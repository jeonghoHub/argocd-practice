FROM openjdk:8
COPY build/libs/*.jar Test.jar
ENTRYPOINT ["java", "-jar", "Test.jar"]