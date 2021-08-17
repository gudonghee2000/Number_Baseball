package model;

import util.RandomUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SystemNumbers {
    private List<BaseballNumber> values = new ArrayList<>(3);

    public SystemNumbers(int[] randomNumbers) {
        values = Arrays.stream(randomNumbers).
                mapToObj(number -> new BaseballNumber(number)).
                collect(Collectors.toList());
    }
}
