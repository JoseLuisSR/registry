# Docker image.
FROM openjdk:8

# Work area.
WORKDIR /usr/src/app

# Copy from host to container.
COPY Customer-0.0.1-SNAPSHOT.jar .

# Metadata to executing docker container.
CMD java -jar Customer-0.0.1-SNAPSHOT.jar

