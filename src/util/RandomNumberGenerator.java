package util;

import java.util.Random;

public class RandomNumberGenerator {

    private static final Integer smallestRange = 1;
    private static final Integer largestRange = 100;

    public Integer getNumber() {
        Random random = new Random();
        return random.nextInt(largestRange - smallestRange + 1) + smallestRange;
    }
}
