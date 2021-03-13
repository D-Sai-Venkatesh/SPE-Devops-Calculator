FROM ubuntu:latest
RUN apt-get update
RUN DEBIAN_FRONTEND="noninteractive" apt-get -y install tzdata
#RUN echo "Asia/Kolkata" > /etc/timezone
ENV TZ=Asia/Kolkata
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

FROM openjdk:8
COPY ./target/SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
#CMD ["java", "-cp", "SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
