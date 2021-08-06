package b6_inheritance.thuchanh;

public class Rectangle extends Shape{
    private double length=1;
    private double width=1;

    public Rectangle(){
    }
    public Rectangle(double length,double width){
        super();
        this.length=length;
        this.width=width;
    }
    public Rectangle(String color, boolean filled,double length,double width){
        super(color, filled);
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
        return "I'm a Rectangle with color: "+this.getColor()+(isFilled()?", filled":", not filled")+
                "\n My length is: "+getLength()+"\n My width is: "+getWidth()+"\n My area is: "+getArea()+"\n My perimeter is: "+getPerimeter();
    }
}
