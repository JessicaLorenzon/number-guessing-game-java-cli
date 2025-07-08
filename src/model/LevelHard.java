package model;

public class LevelHard implements Level {

    @Override
    public Integer getNumberOfChances() {
        return 3;
    }

    @Override
    public String getLevelName() {
        return "Hard";
    }
}
