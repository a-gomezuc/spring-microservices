FROM adoptopenjdk/openjdk11:latest
RUN useradd --create-home account-user
USER account-user
WORKDIR /home/account-user
ARG JAR_FILE=target/\*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/home/account-user/app.jar"]