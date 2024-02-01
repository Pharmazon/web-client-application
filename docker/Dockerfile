FROM dzo.sw.sbc.space/sbt/ci90000459_sblnxos/sblnxos/container-8-ubi-sbt/openjdk-17:8.8.2-189

USER root

COPY web-client-application.jar /web-client-application.jar

EXPOSE 8900
ENTRYPOINT ["java", "-jar", "/web-client-application.jar"]