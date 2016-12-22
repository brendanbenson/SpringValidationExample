## Spring Validation Example

This project demonstrates Spring Validations using Spring Boot.

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