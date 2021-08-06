package b6_inheritance.baitap.circel_andcylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Hinh Tron------------");
        Circle circle1=new Circle();
        Circle circle2=new Circle("white",3);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        System.out.println("-----Hinh Tru------------");
        Cylinder  cylinder1=new Cylinder();
        Cylinder cylinder2=new Cylinder("white",6,8);

        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());
    }
}
