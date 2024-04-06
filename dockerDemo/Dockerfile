FROM eclipse-temurin:8-jre

LABEL author=yejiancong


ARG APP_NAME
ARG TARGET_FILE
ARG JVM_OPTS

WORKDIR /app
ADD ${TARGET_FILE}/${APP_NAME} app.jar
ADD ${TARGET_FILE}/classes/application.properties ./config/application.properties
ADD ${TARGET_FILE}/classes/application.yml ./config/application.yml
ADD ${TARGET_FILE}/lib/ ./lib/

RUN pwd && ls

EXPOSE 8081

CMD java -jar /app/app.jar
