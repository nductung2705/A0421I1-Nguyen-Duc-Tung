package b7_abstractclass_interface.baitap.resizeable;

public class Main {
    public static void main(String[] args) {
        Circle newCircle= new Circle(4);
        Rectangle newRec=new Rectangle(2,3);
        System.out.println("Pre-Resize---");
        System.out.println(newCircle.toString());
        System.out.println(newRec.toString());

        double percent=Math.random()*99+1;
        System.out.println("Random percent is:"+percent);
        newCircle.resize(percent);
        newRec.resize(percent);
        System.out.println("Pre-Resize---");
        System.out.println(newCircle.toString());
        System.out.println(newRec.toString());

    }
}
