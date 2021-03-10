FROM openjdk:8
COPY ./target/SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
RUN DEBIAN_FRONTEND="noninteractive" apt-get -y install tzdata
RUN echo "Asia/Kolkata" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata
CMD ["java", "-cp", "SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
