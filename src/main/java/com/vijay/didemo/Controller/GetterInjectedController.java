package com.vijay.didemo.Controller;

import com.vijay.didemo.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.greeting();
    }

    @Autowired
    @Qualifier("getterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
