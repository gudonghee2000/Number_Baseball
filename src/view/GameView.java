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
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void restartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}

