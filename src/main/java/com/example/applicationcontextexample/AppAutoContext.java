package com.example.applicationcontextexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

//@Configuration
//@ComponentScan(basePackages = "com.example.applicationcontextexample")
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class AppAutoContext {

    @Autowired
    private Country france;

    @Bean("person1")
    public Person personMethod(){
        Person person = new Person("Bob", 25, france);
        return person;
    }

    @Bean(initMethod = "introduce", destroyMethod = "finishOperation")
    @Lazy
    public Person person2(){
        Person person = new Person("Tom", 33, france);
        return person;
    }

}
