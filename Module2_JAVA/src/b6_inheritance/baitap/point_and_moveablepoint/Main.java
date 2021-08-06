package b6_inheritance.baitap.point_and_moveablepoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap toa do ban dau:");
        System.out.println("x=");
        float x= scanner.nextFloat();
        System.out.println("y=");
        float y=scanner.nextFloat();

        Point firstPoint=new Point(x,y);
        System.out.println(firstPoint.toString());

        System.out.println("Nhap toc do di chuyen");
        System.out.println("Move on X=");
        float xSpeed= scanner.nextFloat();
        System.out.println("Move on Y =");
        float ySpeed=scanner.nextFloat();
        MoveablePoint secondPoint=new MoveablePoint(x,y,xSpeed,ySpeed);
        secondPoint.move();
        System.out.println(secondPoint.toString());
    }
}
