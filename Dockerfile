FROM maven:latest

MAINTAINER zhouwei

#RUN pwd

#RUN ls -l

COPY . /tmp

WORKDIR /tmp

RUN mvn clean package -Dmaven.test.skip=true

RUN pwd

RUN ls -l ./src

RUN ls -l ./target


#ADD /tmp/target/springboot-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","./target/springboot-0.0.1-SNAPSHOT.jar.jar"]
