package b6_inheritance.thuchanh;

public class Circle extends Shape {
    private double radius=1.0;

    public Circle(){
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
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
        return "I'm a Circle with color: "+this.getColor()+(isFilled()?", filled":", not filled")+
                "\n My radius is: "+getRadius()+"\n My area is: "+getArea()+"\n My perimeter is: "+getPerimeter();
    }
}
