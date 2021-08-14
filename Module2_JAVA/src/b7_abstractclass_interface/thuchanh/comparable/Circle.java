package b7_abstractclass_interface.thuchanh.comparable;

public class Circle {
    double radius=0;
    String color="green";
    Boolean filled=true;
    public Circle(){
    }
    public Circle(String color, boolean filled, double radius){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(),2);
    }

    public double getPerimeter(){
        return 2*Math.PI*(this.getRadius());
    }
    public String toString(){
        return "\nI'm a Circle with color: "+this.getColor()+(getFilled()?", filled":", not filled")+
                " My radius is: "+getRadius();
    }
}
