package b6_inheritance.baitap.point2d_and_point3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z=0;

    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getLocations(){
        float[] arr= {this.getX(),this.getY(),this.getZ()};
        return arr;
    }
    public String toString(){
        return "Toa do 3D la:"+ Arrays.toString(getLocations());
    }
}
