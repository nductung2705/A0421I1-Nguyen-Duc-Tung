package b7_abstractclass_interface.baitap.colorable;

public abstract class Shape {
    public abstract double getArea();
    public String toString(){
        return "My size "+getArea();
    }
}
