package b4_class_and_object.thuchanh.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chieu rong cua hinh chu nhat: ");
        double wight=scanner.nextDouble();
        System.out.println("Nhap chieu cao cua hinh chu nhat: ");
        double height=scanner.nextDouble();

        do{
            if(wight<=0) {
                System.out.println("Chieu rong sai, nhap lai: ");
                wight = scanner.nextDouble();
            }
            if(height<=0) {
                System.out.println("Chieu cao sai, nhap lai: ");
                height = scanner.nextDouble();
            }
        } while (height<=0||wight<=0);
        Rectangle rectangle=new Rectangle(wight,height);

        rectangle.Display();
    }
}
