package com.example.boundedGenerics.lower;

public class Cat  extends Animal {

    public Cat(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    public String toString() {
        return "Cat: " + getName() + ", Legs: " + getNumberOfLegs();
    }
}
