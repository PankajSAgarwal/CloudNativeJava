# CloudNativeJava
1. bootcamp-IT module - Illustrates integration test that provisions a MySQL service, pushes the application to Cloud Foundry (but doesn’t start it), binds environment variables, binds the MySQL service, and then, finally , starts the application. 
                                           
Credits : Long, Josh,Bastani, Kenny. Cloud Native Java (p. 66). O'Reilly Media. Kindle Edition.  

2. com.example.CloudFoundryClientExample
the Spring and Cloud Foundry teams have developed a Java Cloud Foundry client that supports all the major components in a Cloud Foundry implementation. The Cloud Foundry Java client also supports higher-level, more granular business operations that correspond to the things you might do using the cf CLI. The Cloud Foundry Java client is built on the Pivotal Reactor 3.0 project. Reactor, in turn, underpins the reactive web runtime in Spring Framework 5. The Cloud Foundry Java client is fast , and as it’s built on reactive principles it’s almost entirely non-blocking. 
The heart of this API is the org.reactivestreams.Publisher which may produce zero or more values, eventually. A Subscriber subscribes to notifications of new values from a Publisher . The Reactor project defines two useful specializations of the Publisher : Mono and Flux . A Mono<T> is a Publisher<T> that produces one value. A Flux<T> is a Publisher<T> that produces zero or more values. 

Credits: Long, Josh,Bastani, Kenny. Cloud Native Java (p. 62). 

3. com.example.ApplicationListingCommandLineRunner

is a simple example that will enumerate all the deployed applications in a particular Cloud Foundry space and organization. 



 
