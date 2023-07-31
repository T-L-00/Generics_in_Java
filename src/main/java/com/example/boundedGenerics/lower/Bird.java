package com.example.boundedGenerics.lower;

public class Bird extends Animal {

    public Bird(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    public String toString() {
        return "Bird: " + getName() + ", Legs: " + getNumberOfLegs();
    }
}