package com.dependencyincjection.dependencyinjection.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {

        System.out.println("some intilization Logic");
        this.classA = classA;
    }

    public void DoSomthing() {
        System.out.println("Do Something");
    }

}

@Configuration
@ComponentScan
public class LazyIntilizationLauncherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyIntilizationLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            // System.out.println(context.getBean(BuildYourBussinesClass.class));
            System.out.println("Initilization of context is completed");
            context.getBean(ClassB.class).DoSomthing();
        }
    }
}
