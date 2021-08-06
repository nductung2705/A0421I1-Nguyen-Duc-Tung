package b6_inheritance.thuchanh;

public class Main {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);

            shape = new Shape("red", false);
            System.out.println(shape);

            System.out.println("=================== Hinh Tron==========");
            Circle newCircle=new Circle();
            Circle newCircle2=new Circle("blue",false,5);

            System.out.println(newCircle.toString());
            System.out.println(newCircle2.toString());
            System.out.println("=================== Hinh Chu Nhat==========");
            Rectangle newRec1=new Rectangle();
            Rectangle newRec2=new Rectangle(1,2);
            Rectangle newRec3=new Rectangle("Yellow",false,3,2);

            System.out.println(newRec1.toString());
            System.out.println(newRec2.toString());
            System.out.println(newRec3.toString());


            System.out.println("=================== Hinh Vuong==========");
            Square newSquare1=new Square();
            Square newSquare2=new Square(3);

            System.out.println(newSquare1.toString());
            System.out.println(newSquare2.toString());
        }
    }
