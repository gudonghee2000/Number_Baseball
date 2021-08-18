package controller;

import model.BaseballGame;
import view.GameView;

import static controller.InputController.createUserInputNumbers;
import static util.RandomUtils.createThreeBaseballNumber;

public class GameController {

    public static void runGame() {
        boolean gameRestart = false;
        playGame();
    }

    private static void playGame() {
        BaseballGame baseballGame = new BaseballGame(createThreeBaseballNumber(), createUserInputNumbers());
        while (baseballGame.isNotGameOver()) {
            if (baseballGame.isNoHint()) {
                GameView.showNothing();
                continue;
            }
            GameView.showHints(baseballGame.getBallCount(), baseballGame.getStrikeCount());
            baseballGame.resetInputNumbers(createUserInputNumbers());
        }
        GameView.finishGame();
    }
}
