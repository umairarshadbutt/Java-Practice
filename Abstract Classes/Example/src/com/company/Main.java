package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog= new Dog("Tommy");
        dog.breath();
        dog.eat();

        Bird bird = new Bird("Parrot");
        bird.breath();
        bird.eat();
    }
}