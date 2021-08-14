package b7_abstractclass_interface.baitap.colorable;

public class Square extends Shape implements Colorable{
    private double side;
    public Square( double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String howtoColor() {
        return "Color 4 side";
    }
}
