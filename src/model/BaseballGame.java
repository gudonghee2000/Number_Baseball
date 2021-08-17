package model;

public class BaseballGame {
    private SystemNumbers systemNumbers;
    private InputNumbers inputNumbers;

    public BaseballGame(int[] randomNumbers, int[] userNumbers) {
        systemNumbers = new SystemNumbers(randomNumbers);
        inputNumbers = new InputNumbers(userNumbers);
    }
}
