package burke.personal.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertiesConfig {

    @Value("${test.test}")
    private String test;

    @Value("${test.user}")
    private String user;

    @Value("${testy.user}")
    private String tuser;

    @Value("${testy.password}")
    private String tpasword;

    @Bean
    public Tester tester(){
        Tester tester = new Tester();
        tester.setTest(test);
        tester.setUser(user);
        return tester;
    }

    @Bean
    public Testy testy(){
        Testy t = new Testy();
        t.setUser(tuser);
        t.setPassword(tpasword);
        return t;
    }
}

