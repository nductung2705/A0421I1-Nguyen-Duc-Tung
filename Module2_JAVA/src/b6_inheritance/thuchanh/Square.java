package b6_inheritance.thuchanh;

public class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public String toString(){
        return "I'm Square side" +getSide()+"\n my area is: "+getArea()+"\n my perimeter is: "+getPerimeter();
    }

}
