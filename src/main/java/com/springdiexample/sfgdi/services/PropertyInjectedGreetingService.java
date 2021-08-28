package com.springdiexample.sfgdi.services;

import com.springdiexample.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
