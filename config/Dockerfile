FROM adoptopenjdk/openjdk11:latest
RUN useradd --create-home config-user
USER config-user
WORKDIR /home/config-user
ARG JAR_FILE=target/\*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/home/config-user/app.jar"]