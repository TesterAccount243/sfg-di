package burke.personal.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there from the Constructor";
    }
}
