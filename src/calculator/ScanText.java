package calculator;

import java.util.Scanner;

public class ScanText {
    static int ScanNum1;
    static int ScanNum2;
    static String scanSymbol;

    public void scan () {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        ScanNum1 = scan.nextInt();
        scan.nextLine();

        System.out.print("연산기호 입력 : ");
        scanSymbol = scan.nextLine();

        System.out.print("두번째 숫자 입력 : ");
        ScanNum2 = scan.nextInt();
    }
}
