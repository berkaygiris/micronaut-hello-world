package micronaut.hello.world;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get("/{name}")
    public String hello(String name) {
        return "Hello, " + name + ".\n";
    }
}
