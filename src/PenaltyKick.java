public class PenaltyKick {

    private int scoredCounter;
    private int totalKicked;
    private final Player goalie;

    public PenaltyKick(Player goalie) {
        this.goalie = goalie;
        this.scoredCounter = 0;
        this.totalKicked = 0;
    }

    /*
    You'll notice the kicker is changed out each time. This makes it so
    you can change kickers whenever you want

    This method should check to compare the levels of the kicker and the goalie
    to decide who should win this penalty kick.

    Use the Player#compareTo(Player) method for assistance.

    If the kicker and goalie both have the same level, make the winner random.
    To do this, use Math.random() which returns a double between 0.0 and 1.0.
    From there, check if the number returned is less than 0.5. This gives a 50%
    chance. More examples can be found online.
     */
    public KickResults kick(Player kicker) {

    }

    /*
     When would it make sense to use this method? You can decide
     for yourself when this should be called
     */
    private void increment(boolean didScore) {
        if(didScore) {
            scoredCounter++;
        }
        totalKicked++;
    }

    /*
     What would make sense to represent a penalty shootout as a string?
     You can decide what makes this match a match
     */
    @Override
    public String toString() {

    }
}
