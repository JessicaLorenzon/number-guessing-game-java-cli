package model;

import util.RandomNumberGenerator;

public class Game {

    private Level level;
    private Integer attempts;
    private final Integer randomNumber;

    public Game() {
        this.attempts = 0;
        this.randomNumber = new RandomNumberGenerator().getNumber();
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public void incrementAttempts() {
        this.attempts = attempts + 1;
    }

    public Integer getRandomNumber() {
        return randomNumber;
    }
}
