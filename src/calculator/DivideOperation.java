package calculator;

public class DivideOperation implements Operation {

    @Override
    public double operate(int firstNum, int secondNum) {

        return (double) firstNum / secondNum;
    }
}
