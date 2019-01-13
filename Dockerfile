FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/micronaut-hello-world*.jar micronaut-hello-world.jar
CMD java ${JAVA_OPTS} -jar micronaut-hello-world.jar