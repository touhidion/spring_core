package io.github.touhidion.ioc;

public class Cat implements Animal{
    private String name;
    private Kitten kitten;
    private DogKid dogKid;
    public Cat(String name){
        this.name = name;
    }
    public void setKitten(Kitten kitten) {
        this.kitten = kitten;
    }

    public void setDogKid(DogKid dogKid) {
        this.dogKid = dogKid;
    }

    @Override
    public void talk() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat talks meow");
        kitten.talk();
        dogKid.talk();
    }
}
