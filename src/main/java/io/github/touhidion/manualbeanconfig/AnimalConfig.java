package io.github.touhidion.manualbeanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(value = "io.github.touhidion.manualbeanconfig")
//@PropertySource("classpath:animal.properties")// not working need to test
public class AnimalConfig {

    @Bean
    public Kitten kitten() {
        return new Kitten("Tom kid");
    }

    @Bean
    public Cat catBean() {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setKitten(kitten());
        return cat;
    }
}
