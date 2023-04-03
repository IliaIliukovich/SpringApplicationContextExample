package com.example.applicationcontextexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

//@Configuration
public class AppContext {

//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
////    @Scope("prototype")
//    public HelloWorld helloWorld(){
//        return new HelloWorld();
//    }
//
//    @Bean(name = "france")
//    public Country franceMethod(){
//        Country country = new Country();
//        country.setName("France");
//        country.setCode("FR");
//        return country;
//    }
//
//    @Bean
//    public Country germany(){
//        Country country = new Country();
//        country.setName("Germany");
//        country.setCode("GE");
//        return country;
//    }
//
//    @Bean
//    public Person person1(){
//        Person person = new Person("Bob", 25, franceMethod());
//        return person;
//    }
//
//    @Bean(initMethod = "introduce", destroyMethod = "finishOperation")
//    @Lazy
//    public Person person2(){
//        Person person = new Person("Tom", 33, franceMethod());
//        return person;
//    }


}
