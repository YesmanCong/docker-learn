#!/bin/sh
JAVA_OPTS="-server -Xms64m -Xmx128m -Xmn128m -XX:-UseGCOverheadLimit -DappName=dockerDemo -Djava.rmi.server.hostname=127.0.0.1 -Djava.net.preferIPv4Stack=true -XX:+UseParallelGC -XX:+UseParallelOldGC -XX:ParallelGCThreads=8 -XX:+PrintGCDetails"
nohup java $JAVA_OPTS -jar  dockerDemo-${project.version}.jar  >> nohup.out 2>&1 &