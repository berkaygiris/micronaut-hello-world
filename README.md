# Hello World app with Micronaut and Java

Hello, this repository contains a simple "Hello World" HTTP server application developed with Micronaut Framework on Java. For more information on Micronaut, please visit http://micronaut.io/.  
If you want to explore  the framework yourself, you can follow the instructions below to create a hello world application.

## Prerequisites
 - SDKMAN (to install micronaut cli)
 - JDK 1.8 or newer
 - Maven or Gradle (I used maven as the build tool for this project)
(You can also install JDK, maven and gradle using sdkman)

## Create the application
Install micronaut using sdkman

    $ sdk install micronaut

You can check the installation by using

    $ mn --version
    | Micronaut Version: 1.0.3
    | JVM Version: 1.8.0_192

Create the application using micronaut CLI's create-app command.
I also added --build=maven argument to this operation. Default create-app uses gradle build tool.

    mn create-app micronaut-hello-world --build=maven

## Application Class

create-app will provide you an Application class, where the lifecycle of your micronaut application starts, just like Spring Boot.

    package micronaut.hello.world;  
      
    import io.micronaut.runtime.Micronaut;  
      
    public class Application {  
      
        public static void main(String[] args) {  
            Micronaut.run(Application.class);  
      }  
    }

## Hello Controller

Now go ahead and create a hello controller just like below. 
  

    import io.micronaut.http.annotation.Controller;  
    import io.micronaut.http.annotation.Get;  
      
    @Controller("/hello")  
    public class HelloController {  
      
        @Get("/{name}")  
        public String hello(String name) {  
            return "Hello, " + name + ".\n";  
      }  
    }

## See the result

Start your application and try following.

    $ curl localhost:8080/hello/girisb

And *voilà*, you are ready to explore the Micronaut Framework on Java.


## Todos

 - Include tests
 - Populate services
 - Dockerize the application
