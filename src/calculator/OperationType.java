package calculator;


import static calculator.Calculator.setOperation;

public abstract class OperationType {

    static void operationTypeBySymbol() {
        switch (ScanText.scanSymbol) {
            case "+" :
                setOperation(new AddOperation());
                break;
            case "-" :
                setOperation(new SubstractOperation());
                break;
            case "*" :
                setOperation(new MultiplyOperation());
                break;
            case "/" :
                setOperation(new DivideOperation());
                break;
        }
    }
}
