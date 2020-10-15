package burke.personal.sfgdi.controllers;

import burke.personal.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjection {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
