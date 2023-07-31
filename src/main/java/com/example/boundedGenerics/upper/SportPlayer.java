package com.example.boundedGenerics.upper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents a sports player.
 */
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class SportPlayer {
    private String name;
    private int rank;

    public String getName() {
        return name;
    }
    public int getRank() {
        return rank;
    }
}
