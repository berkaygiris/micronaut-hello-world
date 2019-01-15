package micronaut.hello.world;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/hello")
public class HelloController {

    @Inject
    private HelloService helloService;

    @Get("/{name}")
    public String hello(String name) {
        return helloService.hello(name);
    }
}
