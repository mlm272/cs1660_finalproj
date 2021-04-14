FROM ubuntu:latest
RUN \
apt-get update -y && \
apt-get install default-jre -y
RUN apt-get install -y firefox
ADD toolbox.jar toolbox.jar
CMD java -jar toolbox.jar