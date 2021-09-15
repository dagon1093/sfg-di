package com.springdiexample.sfgdi.config;

import com.springdiexample.sfgdi.datasource.FakeDataSource;
import com.springdiexample.sfgdi.repositories.EnglishGreetingRepository;
import com.springdiexample.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.springdiexample.sfgdi.services.ConstructorGreetingService;
import com.springdiexample.sfgdi.services.I18nEnglishGreetingService;
import com.springdiexample.sfgdi.services.I18nRussianGreetingService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import com.springdiexample.sfgdi.services.PrimaryGreetingService;
import com.springdiexample.sfgdi.services.PropertyInjectedGreetingService;
import com.springdiexample.sfgdi.services.SetterInjectedGreetingService;
import pets.PetService;
import pets.PetServiceFactory;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguration.getSuperuser());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
        return fakeDataSource;
    }

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
//    @Bean
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
