package io.github.superslowjelly.assignment52;

import java.util.Random;

public class PenaltyShootout {

    private int scoredCounter;
    private int totalKicked;
    private final Player goalie;
    private final StringBuilder output = new StringBuilder("Penalty Shootout!\n");

    public PenaltyShootout(Player goalie) {
        this.goalie = goalie;
        this.scoredCounter = 0;
        this.totalKicked = 0;
        this.output.append(goalie.toString()).append(" VS ");
    }

    public int getScoredCounter() {
        return this.scoredCounter;
    }

    public void kick(Player kicker) { // I found that this didn't really need to return a type.
        output.append(kicker.toString()).append(", ");
        if (kicker.compareTo(goalie) == -1) // Goalie saved.
            increment(false);
        else if (kicker.compareTo(goalie) == 0) // Levels equal.
            increment(KickResults.values()[new Random().nextInt(2)] == KickResults.SCORED);
        else // Kicker scored.
            increment(true);
    }

    private void increment(boolean didScore) {
        if (didScore) scoredCounter++;
        totalKicked++;
    }

    @Override
    public String toString() {
        return output.append("\b\b\nScored: ").append(scoredCounter).append('/').append(totalKicked).toString();
    }

}
