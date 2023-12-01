FROM eclipse-temurin:17
MAINTAINER healthcar.pl
COPY build/libs/healthcar-crm-*-SNAPSHOT.jar application.jar
ENTRYPOINT ["java","-jar","/application.jar"]