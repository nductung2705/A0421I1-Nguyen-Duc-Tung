package b15_exception.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiem tra tam giac. Vui long nhap do dai cac canh");
        String triangleString = "";
        while (triangleString == "") {
                System.out.println("a= ");
                float a = scanner.nextFloat();

                System.out.println("b= ");
                float b = scanner.nextFloat();

                System.out.println("c= ");
                float c = scanner.nextFloat();
                try {
                    Triangle triangle = new Triangle(a,b,c);
                    triangleString=triangle.toString();
                }
            catch (TriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui long nhap lai");
            }
        }
        System.out.println(triangleString);
    }
}
