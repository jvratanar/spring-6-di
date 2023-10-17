package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    /*Setter dependency lahko nastavimo z @Autowired na field-u ali pa na setter-ju*/
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
