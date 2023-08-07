package io.github.touhidion.di;

import org.springframework.beans.factory.annotation.Value;

public class Dog implements Animal {
    @Value("${dogName}")
    private String name;

    public void talk() {
        System.out.println("Dog " + name + " talking");
    }
}
