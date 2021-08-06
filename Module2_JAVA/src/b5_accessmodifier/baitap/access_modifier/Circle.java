package b5_accessmodifier.baitap.access_modifier;

public class Circle {
    private double radius=1;
    private String color="red";

    Circle(){
        radius=1;
        color="red";
    }
    Circle(int radius){
        this.radius=radius;
        color="red";
    }
    double getRadius(){
        return this.radius;
    }
    double getArea(){
        return Math.round(Math.pow(this.radius,2)*Math.PI);
    }
}
