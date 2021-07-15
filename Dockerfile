FROM centos

RUN yum install -y java-11-openjdk
VOLUME /tmp
ADD PruebaJenkins/target/pruebajenkins.jar app.jar

RUN sh -c 'touch /app.jar'
EXPOSE 7070
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]pruebajenkins.jar