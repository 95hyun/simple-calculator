package calculator;

import static calculator.Calculator.*;
import static calculator.OperationType.operationTypeBySymbol;

public class Main {
    public static void main(String[] args) {
        ScanText scanText = new ScanText();

        System.out.println("=== 간단 계산기 ===");

        scanText.scan();
        operationTypeBySymbol();
        System.out.println("계산 결과 : " + calculate(ScanText.ScanNum1, ScanText.ScanNum2));
    }
}
