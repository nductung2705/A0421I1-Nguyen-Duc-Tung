package b7_abstractclass_interface.baitap.resizeable;

public class Circle implements Resizeable{
    double radius;
    public double zoom=1;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setZoom(double percent) {
        this.zoom = percent;
    }
    public double getArea(){
        return this.zoom*Math.round(Math.PI*getRadius()*getRadius());
    }
    public String toString(){
        return "My size: "+getArea();
    }
    @Override
    public void resize(double percent) {
        this.zoom+=this.zoom*percent/100;
    }

}
