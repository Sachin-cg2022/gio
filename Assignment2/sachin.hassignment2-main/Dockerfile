FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
WORKDIR /opt
ENV PORT 8012
EXPOSE 8012
COPY target/*.jar /opt/producer.jar
ENTRYPOINT exec java $JAVA_OPTS -jar producer.jar