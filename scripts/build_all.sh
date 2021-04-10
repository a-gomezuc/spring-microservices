mvn clean install
docker build -t agomezuc96/account-service:latest account-service
docker build -t agomezuc96/config-service:latest config
docker build -t agomezuc96/registry-service:latest registry-service
docker build -t agomezuc96/task-service:latest task-service
