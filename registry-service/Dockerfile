FROM adoptopenjdk/openjdk11:latest
RUN useradd --create-home registry-user
USER registry-user
WORKDIR /home/registry-user
ARG JAR_FILE=target/\*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/home/registry-user/app.jar"]
