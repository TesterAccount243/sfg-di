package burke.personal.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there from the Setter";
    }
}
