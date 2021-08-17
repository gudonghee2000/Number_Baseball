package model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Baseball {
    public int value;

    protected Baseball(String baseBall) {
        isNumber(baseBall);
        value = Integer.parseInt(baseBall);
    }

    private void isNumber(String baseBall) {
        if (!baseBall.matches("^[1-9]$")) {
            throw new IllegalArgumentException("입력된 숫자 중 1~9가 아닌 숫자가 있습니다.");
        }
    }
}
