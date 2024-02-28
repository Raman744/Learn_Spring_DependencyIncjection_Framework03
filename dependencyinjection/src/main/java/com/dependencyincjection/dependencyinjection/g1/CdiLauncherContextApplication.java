package com.dependencyincjection.dependencyinjection.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

// @Component
@Named
class BussinessService {

    private DataService dataService;

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }

}

@Component
class DataService {

}

@Configuration
@ComponentScan
public class CdiLauncherContextApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(CdiLauncherContextApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BussinessService.class).getDataService());

        }
    }
}
