package io.github.touhidion.ioc;

public class Dog implements Animal{
    private String name;
    private DogKid dogKid;

    public Dog(DogKid dogKid) {
        this.dogKid = dogKid;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog talks meow");
        dogKid.talk();
    }
}
