package com.example.applicationcontextexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UseBeans {

//    @Autowired
    private final HelloWorld helloWorld;

//    @Autowired
    private final Country france;

//    @Autowired
//    @Qualifier("person1")
    private final Person personOne;

//    @Autowired
//    @Qualifier("person2")
    private final Person personTwo;

//    @Autowired
//    public void setHelloWorld(HelloWorld helloWorld) {
//        this.helloWorld = helloWorld;
//    }
//
//    @Autowired
//    public void setFrance(Country france) {
//        this.france = france;
//    }
//
//    @Autowired
//    public void setPerson1(Person person1) {
//        this.person1 = person1;
//    }
//
//    @Autowired
//    public void setPerson2(Person person2) {
//        this.person2 = person2;
//    }

    @Autowired
    public UseBeans(HelloWorld helloWorld,
                    Country france,
                    @Qualifier("person1") Person personOne,
                    @Qualifier("person2") Person personTwo) {
        this.helloWorld = helloWorld;
        this.france = france;
        this.personOne = personOne;
        this.personTwo = personTwo;
    }

    public void method(){
        System.out.println("Method in UseBeans class invoked");
        System.out.println(helloWorld.getMessage());
        System.out.println(france);
        System.out.println(personOne);
        System.out.println(personTwo);
    }

}
