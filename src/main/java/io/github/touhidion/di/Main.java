package io.github.touhidion.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di-beans.xml");
        /*Animal animal = context.getBean("animal", Animal.class);
        animal.talk();*/
        Animal animal = context.getBean("animal", Animal.class);
        animal.talk();
    }
}
