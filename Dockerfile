FROM openjdk:21-ea-1-jdk
WORKDIR /VacationManager

COPY target/vacationManager-0.0.1-SNAPSHOT.jar /vacationManager-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/vacationManager-0.0.1-SNAPSHOT.jar"]