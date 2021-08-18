package controller;

import view.GameView;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputController {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] createUserInputNumbers() {
        GameView.pleaseInputNumber();
        String[] inputNumbers = scanner.nextLine().split("");
        isNumber(inputNumbers);
        return Arrays.stream(inputNumbers).mapToInt(number -> Integer.parseInt(number)).toArray();
    }

    private static void isNumber(String[] inputNumbers) {
        Arrays.stream(inputNumbers).forEach(number -> {
            if (number.matches("^[^1-9]$")) {
                throw new IllegalArgumentException("입력한 숫자 중 1~9가 아닌 숫자가 있습니다.");
            }
        });
    }
}
