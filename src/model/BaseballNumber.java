package model;

public class BaseballNumber {
    private int value;

    BaseballNumber(int number) {
        isNumber(number);
        value = number;
    }

    private void isNumber(int number) {
        if(number < 1 || number > 9){
            throw new IllegalArgumentException("입력한 숫자 중 1~9가 아닌 수가 있습니다.");
        }
    }

    protected int getNumber(){
        return value;
    }

    @Override
    public boolean equals(Object o){
        BaseballNumber that = (BaseballNumber) o;
        if(this.getNumber() == that.getNumber()){
            return true;
        }
        return false;
    }
}
