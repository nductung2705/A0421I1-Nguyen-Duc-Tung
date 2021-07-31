package b4_class_and_object.thuchanh.rectangle;

public class Rectangle {
    double wight,height;

    public Rectangle(double wight,double height){
    this.wight=wight;
    this.height=height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        double area= this.getWight()*this.getHeight();
        return area;

    }
    public double getPerimeter(){
        double perimeter= 2*(this.getWight()+this.getHeight());
        return perimeter;

    }
    public  void Display(){
        System.out.printf("\n Info of rectangle: Height %f and wight: %f",this.getHeight(),this.getWight());
        System.out.printf("\n Perimeter of rectangle: %f",this.getPerimeter());
        System.out.printf("\n Area of rectangle: %f",this.getArea());
    }
}
