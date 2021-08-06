package b6_inheritance.baitap.point_and_moveablepoint;

import java.util.Arrays;

public class Point {
    private float x=0;
    private float y=0;
    public Point(){
    }
    public Point(float x, float y){
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
    public void setLocations(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getLocations(){
        float[] arr= {this.x,this.y};
        return arr;
    }
    public String toString(){
        return "Toa do la:"+ Arrays.toString(this.getLocations());
    }
}
