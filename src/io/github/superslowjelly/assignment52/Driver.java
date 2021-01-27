package io.github.superslowjelly.assignment52;

public class Driver {

    public static void main(String[] args) {

        // Team A.
        Player[] teamA = {
            new Player("Darcie", 5),
            new Player("Finley", 10),
            new Player("Allyn", 2),
            new Player("Peyton", 1),
            new Player("Indiana", 15)
        };

        // Team B.
        Player[] teamB = {
            new Player("Ash", 3),
            new Player("Sammy", 20),
            new Player("Kelsey", 7),
            new Player("Dell", 5),
            new Player("Syd", 10)
        };

        StringBuilder output = new StringBuilder("Team A VS Team B!\n\n");

        // Player 0 is always the goalie.
        PenaltyShootout penaltyShootout1 = new PenaltyShootout(teamB[0]);
        PenaltyShootout penaltyShootout2 = new PenaltyShootout(teamA[0]);

        for (Player kicker : teamA)
            penaltyShootout1.kick(kicker);

        for (Player kicker : teamB)
            penaltyShootout2.kick(kicker);

        output.append("Team A's ").append(penaltyShootout1.toString())
            .append("\n\nTeam B's ").append(penaltyShootout2.toString());

        if (penaltyShootout1.getScoredCounter() > penaltyShootout2.getScoredCounter())
            output.append("\n\nTeam A won!");
        else if (penaltyShootout1.getScoredCounter() < penaltyShootout2.getScoredCounter())
            output.append("\n\nTeam B won!");
        else
            output.append("\n\nThe match was tied!");

        System.out.print(output.toString());

    }

}
