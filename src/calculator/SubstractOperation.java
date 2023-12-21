package calculator;

public class SubstractOperation implements Operation {

    @Override
    public double operate(int firstNum, int secondNum) {

        return firstNum - secondNum;
    }
}
