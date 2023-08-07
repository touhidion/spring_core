package io.github.touhidion.manualbeanconfig;

public class Kitten {
    private String name;

    public Kitten(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("Talking kitten: " + name);
    }
}
