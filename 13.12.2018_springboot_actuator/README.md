# SpringBootActuator
Production Monitoring and Management with Spring Boot Actuator
47. Endpoints
actuator – Provides a hypermedia-based “discovery page” for the other endpoints. Requires Spring HATEOAS to be on the classpath.
Beans - Displays a complete list of all the Spring beans in your application.
Env - Exposes properties from Spring’s ConfigurableEnvironment.
Info - Displays arbitrary application info.
Health - Shows application health information (when the application is secure, a simple ‘status’ when accessed over an unauthenticated connection or full message details when authenticated).


http://localhost:9090/info

http://localhost:9090/health

http://localhost:9090/beans

http://localhost:9090/env

endpoints.env.id=myenv
endpoints.env.sensitive=true
endpoints.env.enabled=true


POSTMAN

http://localhost:9999/myenv

Authorization

TYPE: Basic Auth

Username – root 

Default Security 

Password - 761dcafa-e999-408b-86c1-c80d100ecebd

management.security.enabled=true

security.basic.enabled=true

security.user.name=admin

security.user.password=root


Authorization

TYPE: Basic Auth

Username – root

Password- admin
