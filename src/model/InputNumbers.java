package model;

import model.BaseballNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputNumbers {
    private List<BaseballNumber> values = new ArrayList<>(3);
    private static final int NUMBER_OF_BALLS = 3;

    public InputNumbers(int[] userNumbers) {
        isValidationNumbers(userNumbers);

        values = Arrays.stream(userNumbers).
                mapToObj(number -> new BaseballNumber(number)).
                collect(Collectors.toList());
    }

    private void isValidationNumbers(int[] userNumbers) {
        final int ballCount = userNumbers.length;

        if (ballCount != NUMBER_OF_BALLS) {
            throw new IllegalArgumentException("입력된 숫자가 3자리가 아닙니다.");
        }

        if (Arrays.stream(userNumbers).distinct().count() != ballCount) {
            throw new IllegalArgumentException("입력된 숫자 중 중복되는 숫자가 있습니다.");
        }
    }
}
