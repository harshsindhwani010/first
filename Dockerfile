FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/1.0-RELEASE.jar 1.0-RELEASE.jar
#EXPOSE 5000
#ENV DATABASE_URL=jdbc:mysql://crm.cn6gkg4mcvow.ap-south-1.rds.amazonaws.com:3306/CRM
ENTRYPOINT ["java","-jar","/1.0-RELEASE.jar"]