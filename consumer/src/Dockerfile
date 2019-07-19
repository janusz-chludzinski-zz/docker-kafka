FROM openjdk:8-jdk-alpine
COPY build/libs/consumer-1.0.jar /opt/kafka/lib/
CMD java -jar /opt/kafka/lib/producer-1.0.jar
VOLUME /tmp
EXPOSE 7777