package model;

public class LevelEasy implements Level {

    @Override
    public Integer getNumberOfChances() {
        return 10;
    }

    @Override
    public String getLevelName() {
        return "Easy";
    }
}
