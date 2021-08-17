package model;

import util.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class SystemNumbers {
    public List<Integer> values = new ArrayList<>(3);
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;

    public void generateNumbers() {
        while (values.size() < 3) {
            int ballNumber = RandomUtils.crateNumber(START_NUMBER, END_NUMBER);

            if (!values.contains(ballNumber)) {
                values.add(ballNumber);
            }
        }
    }
}
