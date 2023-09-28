# SpringShedlockMongo
This project is to configure Spring Boot with embedded Mongo Db for Spring Boot v 2.6.2

Key items 

```
1. Disable <scope>test</scope> for de.flapdoodle.embed'
2. Configure spring.mongodb.embedded.version in application properties;
    otherwise,  the project would result in llegalStateException
3. Configure the following properties in the application.properties, else the port will change everytime
    a. spring.data.mongodb.port=27017
```
