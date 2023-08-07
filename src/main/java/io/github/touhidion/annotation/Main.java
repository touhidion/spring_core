package io.github.touhidion.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-beans.xml");
        Animal animal = context.getBean("cat", Animal.class);
        animal.talk();
    }
}
