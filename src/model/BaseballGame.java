package model;

public class BaseballGame {
    private SystemNumbers systemNumbers;
    private InputNumbers inputNumbers;

    public BaseballGame(int[] randomNumbers, int[] userNumbers) {
        systemNumbers = new SystemNumbers(randomNumbers);
        inputNumbers = new InputNumbers(userNumbers);
    }

    public boolean isGameOver() {
        if (systemNumbers.getStrike(inputNumbers) == 3) {
            return true;
        }
        return false;
    }

    public int getStrikeCount() {
        return systemNumbers.getStrike(inputNumbers);
    }

    public int getBallCount() {
        return systemNumbers.getBall(inputNumbers);
    }
}
