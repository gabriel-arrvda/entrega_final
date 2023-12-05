FROM openjdk:8-jre-slim
WORKDIR /entrega_final
COPY target/*.war /entrega_final/entrega_final-0.0.1-SNAPSHOT.war
EXPOSE 9090
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=9090 -jar entrega_final-0.0.1-SNAPSHOT.war 



