# SpringShedlockMongo
This project is to configure Spring Boot with embedded mongo Db for Spring boot v 2.6.2

Key items 
  Disable <scope>test</scope> for de.flapdoodle.embed'
  Configure spring.mongodb.embedded.version in application properties, else the project would result in llegalStateException
  Configure the following properties in application.properties, else the port would change everytime
    spring.data.mongodb.port=27017
    spring.data.mongodb.host=localhost
