package com.springdiexample.sfgdi.config;

import com.springdiexample.sfgdi.repositories.EnglishGreetingRepository;
import com.springdiexample.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.springdiexample.sfgdi.services.ConstructorGreetingService;
import com.springdiexample.sfgdi.services.I18nEnglishGreetingService;
import com.springdiexample.sfgdi.services.I18nRussianGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import com.springdiexample.sfgdi.services.PrimaryGreetingService;
import com.springdiexample.sfgdi.services.PropertyInjectedGreetingService;
import com.springdiexample.sfgdi.services.SetterInjectedGreetingService;
import pets.PetService;
import pets.PetServiceFactory;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Profile("RUS")
    @Bean("i18nService")
    I18nRussianGreetingService i18nRussianGreetingService(){
        return new I18nRussianGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }


    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
