package b1_introduce_java.thuchanh;

import java.util.Scanner;

public class UseIf {
    public static void main(String[] args) {
        System.out.println("a*x + b = 0");

        Scanner scanner= new Scanner(System.in);

        System.out.println("Type a: " );
        double a=scanner.nextDouble();

        System.out.println("Type b: " );
        double b=scanner.nextDouble();
        double result;

        if(a!=0){
            result=-b/a;
            System.out.println("Result is: "+ result);
        }
        else {
            if(b==0){
                System.out.println("Result is all X");
            }
            else {
                System.out.println("No result");
            }
        }
    }
}
