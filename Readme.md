# How to run the app
``mvn clean package -DskipTests -pl Web -am && java -agentlib:jdwp=transport=dt_socket,server=y,address=5055,suspend=n -jar Web/target/quarkus-app/quarkus-run.jar
``
# Check if the app is able to receive http requests
You should receive HTTP 200 OK response for the following request with response `pong`. 

``curl --location 'http://localhost:8088/ping'``

# How to reproduce

Following request should return HTTP 400 due to mandatory property `value` inside `field` property is missing. However, it returns HTTP 200.  

``curl --location --request PUT 'http://localhost:8088/entities/entity-1' \
--header 'Content-Type: application/json' \
--data '{
"name": "Entity 1",
"field": {
"log": "some log",
"type": "string"
}
}'``

Following is a valid request and returns HTTP 200 as expected:

``curl --location --request PUT 'http://localhost:8088/entities/entity-1' \
--header 'Content-Type: application/json' \
--data '{
"name": "Entity 1",
"field": {
"log": "some log",
"type": "string",
"value": "Hi"
}
}'``
