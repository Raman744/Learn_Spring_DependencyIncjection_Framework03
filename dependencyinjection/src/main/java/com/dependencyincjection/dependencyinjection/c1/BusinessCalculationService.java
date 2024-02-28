package com.dependencyincjection.dependencyinjection.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component
@Service
public class BusinessCalculationService {

    DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }

}
