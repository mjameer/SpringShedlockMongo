# SpringShedlockMongo
This project is to configure Spring Boot with embedded mongo Db for Spring boot v 2.6.2

Key items 
  1. Disable <scope>test</scope> for de.flapdoodle.embed'
  2. Configure spring.mongodb.embedded.version in application properties, else the project would result in llegalStateException
  3. Configure the following properties in application.properties, else the port would change everytime
    
    a. spring.data.mongodb.port=27017
    b. spring.data.mongodb.host=localhost
