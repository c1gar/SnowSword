FROM openjdk:8

LABEL maintainer="cigar"
WORKDIR /root

COPY ./snowsword-0.0.1-SNAPSHOT.jar /root/snowsword-0.0.1-SNAPSHOT.jar
COPY ./wait-for-it.sh /root/wait-for-it.sh
RUN chmod +x /root/wait-for-it.sh
RUN chmod 777 /root/snowsword-0.0.1-SNAPSHOT.jar