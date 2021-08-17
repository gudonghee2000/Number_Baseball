package controller;

import model.BaseballGame;
import model.SystemNumbers;

import java.util.Scanner;

import static controller.Input.createUserInputNumbers;
import static util.RandomUtils.createThreeBaseballNumber;

public class Application {
    public static void main(String[] args) {

        BaseballGame baseballGame = new BaseballGame(createThreeBaseballNumber(), createUserInputNumbers());

    }
}
