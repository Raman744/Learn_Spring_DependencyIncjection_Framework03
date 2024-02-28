package com.dependencyincjection.dependencyinjection.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjecctionLauncherApp {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependencyInjecctionLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
