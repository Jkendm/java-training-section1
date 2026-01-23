package io.github.jkendm.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bosco");
        Cat cat = new Cat("Kitty");
        //Animal animal = new Animal ("Some Random ANimal");

        dog.makeSound();
        cat.makeSound();
       // animal.makeSound();
    }
    
}
