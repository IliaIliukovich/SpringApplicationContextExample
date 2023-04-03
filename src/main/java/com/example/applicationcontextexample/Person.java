package com.example.applicationcontextexample;

public class Person {

    private String name;

    private int age;

    private Country country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Person() {
    }

    public Person(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", country=" + country + '}';
    }

    public void introduce(){
        System.out.println(Person.class + ": actions on init step");
    }

    public void finishOperation(){
        System.out.println(Person.class + ": final work with bean");
    }

}
