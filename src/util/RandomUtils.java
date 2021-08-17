package util;

import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();

    public static int createNumber(int startNumber, int endNumber) {
        return RANDOM.nextInt(endNumber) + startNumber;
    }
}
