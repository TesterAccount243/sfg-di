package burke.personal.sfgdi.controllers;

import burke.personal.sfgdi.services.GreetingService;
import burke.personal.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionTest {

    private SetterInjection setterInjection;
    private GreetingService greetingService;

    @BeforeEach
    void setUp() {
        setterInjection = new SetterInjection();
        greetingService = new GreetingServiceImpl();
        setterInjection.setGreetingService(greetingService);

    }

    @Test
    void setGreetingService() {
        assertEquals("test", setterInjection.sayHello());
    }
}