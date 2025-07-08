package model;

public class LevelMedium implements Level {

    @Override
    public Integer getNumberOfChances() {
        return 5;
    }

    @Override
    public String getLevelName() {
        return "Medium";
    }
}