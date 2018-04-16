git pull
mvn package -DskipTests
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
