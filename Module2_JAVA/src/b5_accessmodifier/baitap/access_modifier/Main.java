package b5_accessmodifier.baitap.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle newCircle= new Circle();
        Circle newCircle2= new Circle(4);

        System.out.println("Hinh 1");
        System.out.println(newCircle.getRadius());
        System.out.println(newCircle.getArea());
        System.out.println("------------------");
        System.out.println("Hinh 2");
        System.out.println(newCircle2.getRadius());
        System.out.println(newCircle2.getArea());

    }
}
