package com.springdiexample.sfgdi.controllers;

import com.springdiexample.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

//        System.out.println("Hello world");
        return greetingService.sayGreeting();
    }
}
