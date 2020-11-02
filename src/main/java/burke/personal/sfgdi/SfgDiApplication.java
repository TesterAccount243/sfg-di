package burke.personal.sfgdi;

import burke.personal.sfgdi.config.PropertiesConfig;
import burke.personal.sfgdi.config.Tester;
import burke.personal.sfgdi.config.Testy;
import burke.personal.sfgdi.controllers.ConstructorInjection;
import burke.personal.sfgdi.controllers.MyController;
import burke.personal.sfgdi.controllers.PropertyInjectedController;
import burke.personal.sfgdi.controllers.SetterInjection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		MyController controller2 = (MyController) ctx.getBean("myController");

		System.out.println(controller.sayTest());
		System.out.println("------------------------");
		System.out.println(controller2.sayTest());

		System.out.println("Property ------------------------");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.sayHello());

		System.out.println("Setter ------------------------");
		SetterInjection setterInjection = ctx.getBean(SetterInjection.class);
		System.out.println(setterInjection.sayHello());

		System.out.println("Constructor ------------------------");
		ConstructorInjection constructorInjection = ctx.getBean(ConstructorInjection.class);
		System.out.println(constructorInjection.sayHello());

		System.out.println("Conf ------------------------");
		Tester t = ctx.getBean(Tester.class);
		System.out.println(t.getTest());
		System.out.println(t.getUser());

		Testy ts = ctx.getBean(Testy.class);
		System.out.println(ts.getUser());
		System.out.println(ts.getPassword());
	}

}
