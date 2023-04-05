package com.example.applicationcontextexample;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Main starts");

//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppAutoContext.class);
        ConfigurableApplicationContext context = SpringApplication.run(AppAutoContext.class, args);
        System.out.println("Context created");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.setMessage("Hello World!");

        System.out.println(helloWorld.getMessage());

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        helloWorld2.setMessage("Another message");

        System.out.println(helloWorld.getMessage());
        System.out.println(helloWorld2.getMessage());

        Country country = (Country) context.getBean("france");
        Person personOne = (Person) context.getBean("person1");
        Person personTwo = (Person) context.getBean("person2");
        System.out.println(personOne.getCountry() == personTwo.getCountry());

//        AppContext appContext = new AppContext();
//        Person person1 = appContext.person1();
//        Person person2 = appContext.person2();
//        System.out.println(person1.getCountry() == person2.getCountry());

        System.out.println(country);
        System.out.println(personOne);
        System.out.println(personTwo);

        UseBeans useBeans = context.getBean(UseBeans.class);
        useBeans.method();

//        UseBeans useBeans = new UseBeans();
//        useBeans.method();

        context.close();
//        context.getBean("person1");
        System.out.println("Main ends");
    }


}
