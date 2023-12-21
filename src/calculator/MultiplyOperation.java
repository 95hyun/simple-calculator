package calculator;

public class MultiplyOperation implements Operation {

    @Override
    public double operate(int firstNum, int secondNum) {

        return firstNum * secondNum;
    }
}
