package view;

public class GameView {
    public static void pleaseInput() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void showNothing() {
        System.out.println("낫싱");
    }

    public static void showHints(int ball, int strike) {
        System.out.printf("%d볼 %d스트라이크\n", ball, strike);
    }

    public static void finishGame() {
        System.out.println("3스트라이크");
    }
}

