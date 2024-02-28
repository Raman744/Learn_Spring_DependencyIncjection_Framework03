package com.dependencyincjection.dependencyinjection.a1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    GamingConsole game;

    public GameRunner(@Qualifier("superContraQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("This is Runner class : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
