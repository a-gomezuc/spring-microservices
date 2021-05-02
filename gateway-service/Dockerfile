FROM adoptopenjdk/openjdk11:latest
RUN useradd --create-home gateway-user
USER gateway-user
WORKDIR /home/gateway-user
ARG JAR_FILE=target/\*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/home/gateway-user/app.jar"]