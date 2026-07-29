
# Microservices with API Gateway

Demonstrates a Spring Cloud microservices setup:
- **eureka-server** — service registry (port 8761)
- **greet-service** — sample REST microservice registered with Eureka (port 8080)
- **api-gateway** — Spring Cloud Gateway routing to services via Eureka discovery,
  with a global filter that logs every incoming request (port 9090)

## Run order
1. eureka-server
2. greet-service
3. api-gateway

## Test
- Eureka dashboard: http://localhost:8761
- Via gateway: http://localhost:9090/greet-service/greet
