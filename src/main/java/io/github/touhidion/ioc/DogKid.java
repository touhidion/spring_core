package io.github.touhidion.ioc;

public class DogKid {
    private String dogKidName;

    public DogKid(String dogKidName) {
        this.dogKidName = dogKidName;
    }

    public void talk() {
        System.out.println("Dog kid " + dogKidName + " talking");
    }
}
