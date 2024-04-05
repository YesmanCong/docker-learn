FROM openjdk:8

MAINTAINER yejiancong
ADD *.jar /app/dockerDemo-0.0.1.jar
WORKDIR /app

ENV JVM_OPTS="-Duser.timezone=Asia/shanghai -Xms128m -Xmx128m"

ENTRYPOINT ["sh","-c","java $JVM_OPTS -jar /app/dockerDemo-0.0.1.jar"]
