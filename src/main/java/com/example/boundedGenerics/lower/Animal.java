package com.example.boundedGenerics.lower;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Animal {
    private String name;
    private int numberOfLegs;
    public String getName() {
        return name;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
