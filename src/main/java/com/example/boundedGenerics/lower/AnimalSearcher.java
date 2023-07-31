package com.example.boundedGenerics.lower;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class AnimalSearcher {

    /**
     * Searches for the animal with the most legs from a list of animals.
     *
     * @param animals A list of animals to search from.
     * @return The animal with the most legs.
     */
    public static <T extends Animal> T findAnimalWithMostLegs(List<T> animals) {
        if(animals == null || animals.isEmpty()) {
            return null;
        }

        T animalWithMostLegs = animals.get(0);
        for (T animal : animals) {
            if(animal.getNumberOfLegs() > animalWithMostLegs.getNumberOfLegs()) {
                animalWithMostLegs = animal;
            }
        }
        return animalWithMostLegs;
    }
}