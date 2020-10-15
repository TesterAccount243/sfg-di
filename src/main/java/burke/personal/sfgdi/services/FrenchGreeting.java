package burke.personal.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("languageGreeting")
@Profile("FR")
public class FrenchGreeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bonjour le Monde";
    }
}
