package burke.personal.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class InjectionGreeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there from the Injected";
    }
}
