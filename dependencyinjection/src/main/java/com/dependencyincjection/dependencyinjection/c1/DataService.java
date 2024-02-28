package com.dependencyincjection.dependencyinjection.c1;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();

}
