#Test The application

You can test the end-to-end result by starting the Config Service first and then, once it is running, starting the client. Visit the client app in the browser at http://localhost:8080/message. There, you should see Hello world in the response.

Change the message key in the a-bootiful-client.properties file in the Git repository to something different (Hello Spring!, perhaps?). You can confirm that the Config Server sees the change by visiting http://localhost:8888/a-bootiful-client/default. You need to invoke the refresh Spring Boot Actuator endpoint in order to force the client to refresh itself and draw in the new value. Spring Boot’s Actuator exposes operational endpoints (such as health checks and environment information) about an application. To use it, you must add org.springframework.boot:spring-boot-starter-actuator to the client application’s classpath. You can invoke the refresh Actuator endpoint by sending an empty HTTP POST to the client’s refresh endpoint: http://localhost:8080/actuator/refresh. Then you can confirm it worked by visting the http://localhost:8080/message endpoint.

The following command invokes the Actuator’s refresh command:
$ curl localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"

