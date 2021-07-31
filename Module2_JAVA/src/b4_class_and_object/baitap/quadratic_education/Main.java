package b4_class_and_object.baitap.quadratic_education;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phuong trinh co dang: ax2+bx+c=0");

        System.out.println("Nhap chi so a:");
        double a=scanner.nextDouble();

        System.out.println("Nhap chi so b:");
        double b=scanner.nextDouble();

        System.out.println("Nhap chi so c:");
        double c=scanner.nextDouble();

        Quadratic phuongTrinh=new Quadratic(a,b,c);

        double delta=phuongTrinh.getDelta();
        if(delta>0){
            System.out.printf("Phuong trinh co 2 nghiem la: %s", Arrays.toString(phuongTrinh.getRoot()));
        }
        else if(delta==0){
            System.out.printf("Phuong trinh co 1 nghiem la: %f", phuongTrinh.getOneRoot());
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
