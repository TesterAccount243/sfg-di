package burke.personal.sfgdi.controllers;

import burke.personal.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("languageGreeting") final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayTest() {
        return greetingService.sayGreeting();
    }
}
