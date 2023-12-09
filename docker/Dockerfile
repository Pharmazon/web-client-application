FROM openjdk:17-jdk

USER root

COPY web-client-application.jar /web-client-application.jar

EXPOSE 8900
ENTRYPOINT ["java", "-jar", "/web-client-application.jar"]