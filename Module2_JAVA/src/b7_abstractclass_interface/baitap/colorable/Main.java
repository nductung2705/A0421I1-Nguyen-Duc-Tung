package b7_abstractclass_interface.baitap.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapeList=new Shape[4];
        shapeList[0]=new Circle(2);
        shapeList[1]=new Circle(3);
        shapeList[2]=new Square(6);
        shapeList[3]=new Circle(1);

        for(Shape shape : shapeList){
            if(shape instanceof Square){
                System.out.println(((Square) shape).howtoColor());
            }
            System.out.println(shape.toString());
        }
    }
}
