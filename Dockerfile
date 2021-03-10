FROM openjdk:8
COPY ./target/SPE-Mini-Project-1.0-SNAPSHOT.jar ./
WORKDIR ./
RUN apt-get update && apt-get upgrade -y && apt-get install -y ntp
RUN ntpd -gq
RUN service ntp start
CMD ["java", "-cp", "SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
