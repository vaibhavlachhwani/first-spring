package com.vaibhav.first_spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfguration {
    @Bean
    public String name() {
        return "Max";
    }

    @Bean
    public int age() {
        return 28;
    }

    @Bean
    public Person  person() {
        return new Person("Carlos", 27, address());
    }

    @Bean
    @Primary
    public Person person2(String name, int age, Address customAdd) {
        return new Person(name, age, customAdd);
    }

    @Bean(name = "customAdd")
    public Address address() {
        return new Address("57 Oak Wood St.", "Gotham City");
    }
}
