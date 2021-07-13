package b1_introduce_java.baitap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        final float rate=23000;
        Scanner scanner= new Scanner(System.in);

        System.out.printf("Input Money(USD): ");
        float inputMoney=scanner.nextFloat();

        float outputMoney=inputMoney*rate;

        System.out.printf("%.2f USD = %.2f VND",inputMoney,outputMoney);
    }
}
