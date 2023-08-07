package io.github.touhidion.manualbeanconfig;

public class Cat implements Animal {
    private String name;

    private Kitten kitten;

    public void setName(String name) {
        this.name = name;
    }

    public void setKitten(Kitten kitten) {
        this.kitten = kitten;
    }

    @Override
    public void talk() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat talks meow");
        kitten.talk();
    }
}
