package com.dependencyincjection.dependencyinjection.f1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependency are ready !");

    }

    @PreDestroy
    public void intilization() {
        someDependency.getReady();
    }

}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using someDependency");

    }
}

@Configuration
@ComponentScan
public class PrePostLauncherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(PrePostLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
