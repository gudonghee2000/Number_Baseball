package model;

import util.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class SystemBalls {
    public List<Integer> values = new ArrayList<>(3);
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;

    public void createSystemBalls() {
        while (values.size() < 3) {
            int ball = RandomUtils.crateBall(START_NUMBER, END_NUMBER);

            if (!values.contains(ball)) {
                values.add(ball);
            }
        }
    }
}
