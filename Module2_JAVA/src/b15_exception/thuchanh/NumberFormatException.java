package b15_exception.thuchanh;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            System.out.println("Nhap so nguyen x: ");
            int x=scanner.nextInt();
            System.out.println("Nhap so nguyen y: ");
            int y=scanner.nextInt();
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("Tong: "+a);
            System.out.println("Hieu: "+b);
            System.out.println("Tich: "+c);
            System.out.println("Thuong: "+d);
        }catch (ArithmeticException e){
            System.out.println("Phep chia cho 0");
            e.getMessage();
        }
        catch (Exception e){
            System.out.println("Xay ra ngoai le khac");
            e.getMessage();
        }
    }
}
