package calculator;

public class Calculator {
    private static Operation operation;

    public static void setOperation(Operation operation) {
        Calculator.operation = operation;
    }

    public static int calculate(int firstNum, int secondNum) {
        if (operation != null) {
            return (int)operation.operate(firstNum, secondNum);
        } else {
            System.out.println("잘못된 입력입니다.");
            throw new IllegalStateException("연산기호가 잘못 입력되었습니다.");
        }
    }
}
