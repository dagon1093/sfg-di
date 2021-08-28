package com.springdiexample.sfgdi.services;

import com.springdiexample.sfgdi.services.GreetingService;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}
