# healthcar-crm


## Project run info:
### Project build:
```
./gradlew build
```

### Build a new image:
```
docker build --tag=healthcar:latest . 
```

### Run docker compose:
```
docker-compose up
```
or

```
./start.sh
./start.bat
```

## Open-Api info
```
* Api doc link /api-doc
* Swagger link /swagger-ui/index.html
```


## Actuator Info
### Actuator is run on port `8081`
```
* Shutdown application  curl -X POST localhost:8081/actuator/shutdown
* Healthcheck endpoint /actuator/health
* Info endpoint /actuator/info
* Liquibase info endpoint /actuator/liquibase
```