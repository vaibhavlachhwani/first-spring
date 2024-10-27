package com.vaibhav.first_spring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        //1 -> Launch Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfguration.class)) {

            //2 -> Configure the things we want spring to manage :
            // @Configuration class
            // @Bean : name

            //3 -> Retrieving Beans manage by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("customAdd"));
            System.out.println(context.getBean("person2"));

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);

        }
    }
}
