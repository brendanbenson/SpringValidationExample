## Spring Validation Example

This project demonstrates Spring Validations using Spring Boot.

Read a full description of this repository on my blog post about [Spring validation](http://www.bbenson.co/post/spring-validations-with-examples/).

To run the application:
```
./gradlew bootRun
```

To send a request to the ```products``` endpoint:

```
curl -X POST -H "Content-Type: application/json" -d '{
	"name": "Avocado",
	"price": 79,
	"sku": "AV87"
}' "http://localhost:8080/products"
```
