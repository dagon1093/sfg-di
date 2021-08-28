package com.springdiexample.sfgdi.services;


import com.springdiexample.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;


public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
