FROM openjdk:8-jdk-alpine

RUN mkdir /app

WORKDIR /app

COPY build/libs/guiabolso-challenge-1.0-SNAPSHOT.jar /app/guiabolso-challenge-1.0-SNAPSHOT.jar

CMD ["sh", "-c", "java -jar guiabolso-challenge-1.0-SNAPSHOT.jar"]