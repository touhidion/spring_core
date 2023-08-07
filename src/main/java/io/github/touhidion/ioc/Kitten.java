package io.github.touhidion.ioc;

public class Kitten {
    private String kittenName;

    public void setKittenName(String kittenName) {
        this.kittenName = kittenName;
    }

    public void talk() {
        System.out.println("Talking kitten: " + kittenName);
    }
}
