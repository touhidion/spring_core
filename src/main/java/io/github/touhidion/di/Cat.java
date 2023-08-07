package io.github.touhidion.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Cat implements Animal {
    @Value("sdf")
    private String name;
    private Dog dog;

    @Qualifier
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void talk() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat talks meow");
    }
}
