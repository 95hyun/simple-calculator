package calculator;

public class AddOperation implements Operation {

    @Override
    public double operate(int firstNum, int secondNum) {

        return firstNum + secondNum;
    }
}
