public class Player {

    private final String name;
    private final int level;

    public Player(String name, int level) {

    }

    /*
     Returns -1 if this player is worse than the formal parameters other player
     Returns 0 if this player is the same as the formal parameters other player
     Returns 1 if this player is better than the formal parameters other player
     */
    public int compareTo(Player otherPlayer) {

    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (lvl: " + level + ")";
    }
}
