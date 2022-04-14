package snippet;

public class Snippet {
	spring:
	  application:
	    name: api-gateway
	    server:
	         port : 8081
	    spring:
	  cloud:
	    gateway:
	      routes:
	      - id: student-service
	        uri: http://localhost:9090/
	        predicates:
	        - Path=/api/student/**
	      - id: management-service
	        uri: http://localhost:9091/
	        predicates:
	        - Path=/api/management/**
}

