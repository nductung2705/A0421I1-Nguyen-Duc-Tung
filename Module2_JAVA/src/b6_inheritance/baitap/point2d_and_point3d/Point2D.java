package b6_inheritance.baitap.point2d_and_point3d;

import java.util.Arrays;

public class Point2D {
    private float x=0;
    private float y=0;
    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getLocations(){
        float[] arr= {this.x,this.y};
        return arr;
    }
    public String toString(){
        return "Toa do 2D la:"+ Arrays.toString(getLocations());
    }
}
