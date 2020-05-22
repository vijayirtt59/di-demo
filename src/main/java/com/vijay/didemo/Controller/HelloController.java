package com.vijay.didemo.Controller;

import com.vijay.didemo.services.*;
import org.springframework.stereotype.*;

@Controller
public class HelloController {

    private GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!");
        return greetingService.greeting();
    }
}
