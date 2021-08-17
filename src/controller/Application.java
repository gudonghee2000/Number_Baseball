package controller;

import model.InputBalls;
import model.SystemBalls;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        SystemBalls systemBalls = new SystemBalls();
        systemBalls.createSystemBalls();

        InputBalls inputBalls = new InputBalls();
        inputBalls.createInputBalls(scanner.nextLine().split(""));
    }
}
