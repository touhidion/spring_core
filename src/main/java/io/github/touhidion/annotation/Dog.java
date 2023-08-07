package io.github.touhidion.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Dog implements Animal {
    @Value("${dogName}")
    private String name;

    public void talk() {
        System.out.println("Dog " + name + " talking");
    }
}
