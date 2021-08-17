package util;

import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();

    public static int crateNumber(int startNumber, int endNumber) {
        return RANDOM.nextInt(endNumber) + startNumber;
    }
}
