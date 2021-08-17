package controller;

import model.BaseballGame;
import model.SystemNumbers;

import java.util.Scanner;

import static controller.Input.createUserInputNumbers;
import static util.RandomUtils.createThreeBaseballNumber;

public class Application {
    public static void main(String[] args) {

        BaseballGame baseballGame = new BaseballGame(createThreeBaseballNumber(), createUserInputNumbers());

        if (baseballGame.isGameOver()) {
            System.out.println("3스트라이크");
        } else {
            System.out.printf("%d볼 %d스트라이크\n", baseballGame.getBallCount(), baseballGame.getStrikeCount());
        }
    }
}
