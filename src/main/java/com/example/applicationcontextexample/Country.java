package com.example.applicationcontextexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "france")
public class Country {

    @Value("${country.name}")
    private String name;

    @Value("${country.code}")
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country{" + "name='" + name + '\'' + ", code='" + code + '\'' + '}';
    }
}
