package com.dependencyincjection.dependencyinjection.a1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class superContra implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go back");
    }

    public void left() {
        System.out.println("sit down");
    }

    public void right() {
        System.out.println("shoot bullet");
    }

}
