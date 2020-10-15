package burke.personal.sfgdi.controllers;

import burke.personal.sfgdi.services.GreetingService;
import burke.personal.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionTest {
    private ConstructorInjection constructorInjection;
    private GreetingService greetingService;

    @BeforeEach
    void setUp() {
        greetingService = new GreetingServiceImpl();
        constructorInjection = new ConstructorInjection(greetingService);
    }

    @Test
    void sayHello() {
        assertEquals("test", constructorInjection.sayHello());
    }
}