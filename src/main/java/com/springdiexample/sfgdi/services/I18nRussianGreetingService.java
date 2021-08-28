package com.springdiexample.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nRussianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Привет мир - RUS";
    }
}
