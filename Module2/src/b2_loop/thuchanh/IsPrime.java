package b2_loop.thuchanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.printf("Nhap so: ");
        int number=scanner.nextInt();

        if(number<2){
            System.out.printf("%d khong phai so nguyen to",number);
        }
        else {
            int i=2;
            boolean flag=true;
            while (i < (number/2)){
                if(number%i == 0){
                    flag=false;
                    break;
                }
                i++;
            }
            if(flag){
                System.out.printf("%d la so nguyen to",number);

            }
            else {
                System.out.printf("%d khong phai so nguyen to",number);
            }
        }
    }
}
