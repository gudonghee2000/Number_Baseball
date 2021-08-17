package util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtils {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_SIZE = 3;

    public static int createNumber(int startNumber, int endNumber) {
        return RANDOM.nextInt(endNumber) + startNumber;
    }

    public static int[] createThreeBaseballNumber() {
        Set<Integer> randomNumbers = new HashSet<>(3);

        while (randomNumbers.size() < MAX_SIZE) {
            randomNumbers.add(createNumber(MIN_NUMBER, MAX_NUMBER));
        }

        return randomNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
