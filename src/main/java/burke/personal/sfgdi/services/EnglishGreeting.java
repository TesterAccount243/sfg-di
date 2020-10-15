package burke.personal.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("languageGreeting")
public class EnglishGreeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
