FROM openjdk:8
COPY ./target/SPE-Mini-Project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPE-Mini-Project-1.0-SNAPSHOT.jar", "Calculator"]