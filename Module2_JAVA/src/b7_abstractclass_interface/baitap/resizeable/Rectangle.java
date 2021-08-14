package b7_abstractclass_interface.baitap.resizeable;

public class Rectangle implements Resizeable {
    private double length = 1;
    private double width = 1;
    public double zoom=1;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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

    public double getArea() {
        return getLength() * getWidth()*this.zoom;
    }
    public String toString(){
        return "My size: "+getArea();
    }
    @Override
    public void resize(double percent) {
        this.zoom+=zoom*percent/100;
    }
}
