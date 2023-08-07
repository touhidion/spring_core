package io.github.touhidion.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitten {
    @Value("hellokit")
    private String kittenName;

    public void talk() {
        System.out.println("Talking kitten: " + kittenName);
    }
}
