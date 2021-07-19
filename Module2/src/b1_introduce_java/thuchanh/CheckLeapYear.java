package b1_introduce_java.thuchanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhap nam muon kiem tra: ");
        int year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    flag=true;
                }
            }
            else {
                flag=true;
            }
        }
        if(flag){
            System.out.printf("%d is a leap year", year);
        }
        else {
            System.out.printf("%d is not a leap year", year);
        }

    }
}
