package io.github.touhidion.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-beans.xml");
        Animal animal = context.getBean("animal", Animal.class);
        animal.talk();
    }
}
