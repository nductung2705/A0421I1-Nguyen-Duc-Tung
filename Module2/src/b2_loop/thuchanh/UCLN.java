package b2_loop.thuchanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap so thu 1: ");
        int number1 = scanner.nextInt();

        System.out.printf("Nhap so thu 2: ");
        int number2 = scanner.nextInt();

        int ucln = findUCLN(number1,number2);
        System.out.printf("UCLN cua %d va %d la %d",number1,number2,ucln);
    }


    public static int findUCLN(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
        return number1;
    }
}