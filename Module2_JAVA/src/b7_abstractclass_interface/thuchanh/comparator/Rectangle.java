package b7_abstractclass_interface.thuchanh.comparator;

public class Rectangle {
    private double length=1;
    private double width=1;

    public Rectangle(){
    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
    public String toString(){
        return "My size "+getArea();
    }

}
