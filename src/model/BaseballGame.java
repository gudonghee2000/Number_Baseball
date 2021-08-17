package model;

public class BaseballGame {
    private SystemNumbers systemNumbers;
    private InputNumbers inputNumbers;

    BaseballGame(int[] randomNumbers, int[] userNumbers){
        systemNumbers = new SystemNumbers(randomNumbers);
        inputNumbers = new InputNumbers(userNumbers);
    }
}
