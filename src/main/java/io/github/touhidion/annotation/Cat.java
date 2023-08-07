package io.github.touhidion.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Value("${animal.catName}")
    private String name;

    @Autowired
    private Kitten kitten;
    @Override
    public void talk() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat talks meow");
        kitten.talk();
    }
}
