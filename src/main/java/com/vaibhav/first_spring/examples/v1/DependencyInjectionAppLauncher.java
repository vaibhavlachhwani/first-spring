package com.vaibhav.first_spring.examples.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;

@Component
class BussinessClass {
//    @Autowired
    Dependency1 dep1;

//    @Autowired    //Field based DI
    Dependency2 dep2;

    public BussinessClass(Dependency1 dep1, Dependency2 dep2) {
        this.dep1 = dep1;
        this.dep2 = dep2;
    }

    //    @Autowired    //Setter based DI
    public void setDep1(Dependency1 dep1) {
        this.dep1 = dep1;
    }

//    @Autowired
    public void setDep2(Dependency2 dep2) {
        this.dep2 = dep2;
    }

    @Override
    public String toString() {
        return "Using : {\n" +
                "\t[Dependency 1 : " + dep1 + "]\n" +
                "\t[Dependency 2 : " + dep2 + "]\n" +
                "}";
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan  // By default performs component scan on current package
public class DependencyInjectionAppLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionAppLauncher.class)) {
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);

            System.out.println(context.getBean(BussinessClass.class));
        }
    }
}
