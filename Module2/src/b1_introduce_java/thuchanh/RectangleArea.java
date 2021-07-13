package b1_introduce_java.thuchanh;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        float width,height,area;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Type the Width:");
        width=scanner.nextFloat();

        System.out.println("Type the Height:");
        height=scanner.nextFloat();

        area=width*height;
        System.out.println("Area is: "+area);
    }
}
