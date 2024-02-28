package com.dependencyincjection.dependencyinjection.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependencyincjection.dependencyinjection.a1.GameRunner;

public class XmlConfigurationLauncherContextApplication {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext(
                "contextCofiguration.xml")) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();

        }
    }
}
