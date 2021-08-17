package model;

import util.RandomUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SystemNumbers {
    private List<BaseballNumber> values = new ArrayList<>(3);

    public SystemNumbers(int[] randomNumbers) {
        values = Arrays.stream(randomNumbers).
                mapToObj(number -> new BaseballNumber(number)).
                collect(Collectors.toList());
    }

    public int getStrikeCount(InputNumbers inputNumbers) {
        return (int) IntStream.range(0, 3).
                filter(index -> values.get(index).equals(inputNumbers.getInputNumbers().get(index))).
                count();
    }

    public int getBallCount(InputNumbers inputNumbers) {
        return (int) IntStream.range(0, 3).
                filter(index -> values.contains(inputNumbers.getInputNumbers().get(index))).
                filter(index -> !values.get(index).equals(inputNumbers.getInputNumbers().get(index))).
                count();
    }
}

