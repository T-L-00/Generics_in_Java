package com.example.boundedGenerics.upper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Represents a sports team and calculates the average rank of players.
 *
 * @param <T> The type of sport player.
 */
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class SportsTeam <T extends SportPlayer> {

    private List<T> players;

    public double calculateAverageRank() {
        if(players == null || players.isEmpty()) {
            return 0.0;
        }
        double totalRank = 0.0;
        for (T player : players) {
            totalRank += player.getRank();
        }
        return totalRank / players.size();
    }
}