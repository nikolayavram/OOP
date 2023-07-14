package HomeWork_2.impl;


import HomeWork_2.Animal;
import HomeWork_2.Flyable;
import HomeWork_2.Speakable;

public class Parrot extends Animal implements Speakable, Flyable {
    public Parrot(String name, String color) {
        super(name, color,2);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Я попугай, я умею разговаривать!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 40;
    }
}

