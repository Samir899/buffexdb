FROM openjdk:17-oracle
EXPOSE 8080
ADD target/buffexdb.jar buffexdb.jar
ENTRYPOINT [ "java", "-jar", "/buffexdb.jar" ]