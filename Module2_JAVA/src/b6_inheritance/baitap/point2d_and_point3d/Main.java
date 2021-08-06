package b6_inheritance.baitap.point2d_and_point3d;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("------2D-------");

        Point2D shape2D=new Point2D();
        System.out.println(shape2D.toString());

        System.out.println("Nhap x: ");
        float x= scanner.nextFloat();

        System.out.println("Nhap y: ");
        float y= scanner.nextFloat();

        Point2D shape2D1=new Point2D(x,y);
        System.out.println(shape2D1.toString());

        System.out.println("------3D-------");

        Point3D shape3D=new Point3D();
        System.out.println(shape3D.toString());

        System.out.println("Nhap x: ");
        x= scanner.nextFloat();

        System.out.println("Nhap y: ");
        y= scanner.nextFloat();

        System.out.println("Nhap z: ");
        float z= scanner.nextFloat();

        Point3D shape3D1=new Point3D(x,y,z);
        System.out.println(shape3D1.toString());
    }
}
