package io.github.superslowjelly.assignment52;

public class Player {

    private final String name;
    private final int level;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int compareTo(Player otherPlayer) {
        return Integer.compare(this.level, otherPlayer.getLevel());
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return name + " (lvl: " + level + ")";
    }
}
