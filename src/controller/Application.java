package controller;

import model.SystemNumbers;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        SystemNumbers randomNumbers = new SystemNumbers();
        randomNumbers.generateNumbers();


    }
}
