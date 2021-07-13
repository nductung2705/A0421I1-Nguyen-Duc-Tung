package b1_introduce_java.thuchanh;

import java.util.Scanner;

public class UseSwitchCase {
    public static void main(String[] args) {
        byte month;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Type the Month: ");
        month=scanner.nextByte();
        switch (month){
            case 2:
                System.out.println("28 or 29");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("Wrong Month");

        }
    }
}
