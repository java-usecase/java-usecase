FROM anapsix/alpine-java:8u192b12_jdk
MAINTAINER kenly33@126.com
VOLUME /tmp
ADD certs/ ${JAVA_HOME}/jre/lib/security/
ARG APP_FILE=app.jar
ADD ${APP_FILE} app.jar
RUN ln -s ${JAVA_HOME}/jre/lib/security/servicehive.jks /servicehive.jks && touch /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/urandom","-jar","app.jar"]