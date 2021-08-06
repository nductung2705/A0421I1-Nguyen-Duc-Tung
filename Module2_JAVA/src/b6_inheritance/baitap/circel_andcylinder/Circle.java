package b6_inheritance.baitap.circel_andcylinder;

public class Circle {
    private String color="blue";
    private double radius=1.0;

    public Circle(){
    }
    public Circle(String color, double radius){
        this.color=color;
        this.radius=radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(),2);
    }
    public double getPerimeter(){
        return 2*Math.PI*(this.getRadius());
    }
    public String toString(){
        return "I'm a Circle with color: "+this.getColor()+
                "\n My radius is: "+getRadius()+"\n My area is: "+getArea()+"\n My perimeter is: "+getPerimeter();
    }
}
