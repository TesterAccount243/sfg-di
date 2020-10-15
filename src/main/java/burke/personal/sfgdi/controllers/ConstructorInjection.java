package burke.personal.sfgdi.controllers;

import burke.personal.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjection {
    private final GreetingService greetingService;

    public ConstructorInjection(@Qualifier("constructorGreeting") final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
