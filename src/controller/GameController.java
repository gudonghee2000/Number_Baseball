package controller;

import model.BaseballGame;
import view.GameView;

import static controller.InputController.createUserInputNumbers;
import static util.RandomUtils.createThreeBaseballNumber;

public class GameController {

    public static void runGame() {
        boolean gameRestart = false;
        while (!gameRestart) {
            playGame();
            gameRestart = restartGame();
        }
    }

    private static void playGame() {
        BaseballGame baseballGame = new BaseballGame(createThreeBaseballNumber(), createUserInputNumbers());
        while (baseballGame.isNotGameOver()) {
            if (baseballGame.isNoHint()) {
                GameView.showNothing();
            } else {
                GameView.showHints(baseballGame.getBallCount(), baseballGame.getStrikeCount());
            }
            baseballGame.resetInputNumbers(createUserInputNumbers());
        }
        GameView.showHints(baseballGame.getBallCount(), baseballGame.getStrikeCount());
        GameView.finishGame();
    }

    private static boolean restartGame() {
        GameView.restartGame();
        int flag = InputController.flagInput();
        if (flag == 1) {
            return false;
        } else {
            return true;
        }
    }
}
