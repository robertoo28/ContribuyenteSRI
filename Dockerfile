FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base
EXPOSE 8080
ADD target/ContribuyenteSRI-0.0.1-SNAPSHOT.jar ContribuyenteSRI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ContribuyenteSRI-0.0.1-SNAPSHOT.jar"]