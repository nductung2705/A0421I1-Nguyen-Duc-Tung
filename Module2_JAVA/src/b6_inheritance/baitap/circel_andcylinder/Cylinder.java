package b6_inheritance.baitap.circel_andcylinder;

public class Cylinder extends Circle{
    private double height=1;

    public Cylinder(){
    }
    public Cylinder(String color,double radius,double height){
        super(color, radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius()*getHeight();
    }
    public double getArea(){
        return (2*Math.PI*Math.pow(getRadius(),2))+(2*Math.PI*getRadius()*getHeight());
    }
    public String toString(){
        return "I'm a Circle with color: "+this.getColor()+
                "\n My radius is: "+getRadius()+"\n My height is: "+getHeight()+"\n My area is: "+getArea()+"\n My perimeter is: "+getPerimeter();
    }
}
