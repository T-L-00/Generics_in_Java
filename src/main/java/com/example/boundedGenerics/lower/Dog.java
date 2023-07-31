package com.example.boundedGenerics.lower;

public class Dog extends Animal {

    public Dog(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    public String toString() {
        return "Dog: " + getName() + ", Legs: " + getNumberOfLegs();
    }
}
