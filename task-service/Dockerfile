FROM adoptopenjdk/openjdk11:latest
RUN useradd --create-home task-user
USER task-user
WORKDIR /home/task-user
ARG JAR_FILE=target/\*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/home/task-user/app.jar"]