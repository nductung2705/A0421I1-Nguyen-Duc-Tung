package b2_loop.baitap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=0;
        while (number!=4){
            System.out.println("Menu: ");
            System.out.println("1. Rectangle ");
            System.out.println("2. Square Triangle ");
            System.out.println("3. Isosceles triangle ");
            System.out.println("4. Exit: ");

            number=scanner.nextInt();
            switch (number){
                case 1: {
                    System.out.println("Nhap chieu cao");
                    int height= scanner.nextInt();
                    System.out.println("Nhap chieu dai");
                    int length= scanner.nextInt();
                    DrawRectangle(height,length);
                    break;
                }
                case 2: {
                    System.out.println("Nhap chieu cao");
                    int height= scanner.nextInt();
                    DrawSquareTriangle(height);
                    break;
                }
                case 3: {
                    System.out.println("Nhap chieu cao");
                    int height= scanner.nextInt();
                    DrawIsoscelesTriangle(height);
                    break;
                }
                }
            }
        }
    public static void DrawRectangle(int height, int length){
        for(int i=1;i<=height;i++){
            for(int j=1;j<=length;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void DrawSquareTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void DrawIsoscelesTriangle(int height) {
        int space=1;
        while(height>0) {
            for (int i = 1; i <= height; i++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= space; j++) {
                    System.out.print("*");

            }
            System.out.print("\n");
            height--;
            space+=2;
        }
    }

}

