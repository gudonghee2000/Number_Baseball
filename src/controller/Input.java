package controller;

import java.util.Arrays;

public class Input {
    public static int[] createUserInputNumbers(String[] inputNumbers){
        return Arrays.stream(inputNumbers).mapToInt(number -> Integer.parseInt(number)).toArray();
    }
}
