package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputBalls {
    private List<Baseball> values = new ArrayList<>();
    private static final int NUMBER_OF_BALLS = 3;

    public void createInputBalls(String[] inputBalls) {
        isValidationBalls(inputBalls);

        Arrays.stream(inputBalls).forEach(number -> {
            Baseball baseball = new Baseball(number);
            values.add(baseball);
        });
    }

    private void isValidationBalls(String[] inputBalls) {
        final int ballCount = inputBalls.length;

        if (ballCount != NUMBER_OF_BALLS) {
            throw new IllegalArgumentException("입력된 숫자가 3자리가 아닙니다.");
        }

        if (Arrays.stream(inputBalls).distinct().count() != ballCount) {
            throw new IllegalArgumentException("입력된 숫자 중 중복되는 숫자가 있습니다.");
        }
    }
}
