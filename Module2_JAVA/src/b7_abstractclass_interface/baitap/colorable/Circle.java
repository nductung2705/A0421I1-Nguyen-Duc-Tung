package b7_abstractclass_interface.baitap.colorable;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }
}
