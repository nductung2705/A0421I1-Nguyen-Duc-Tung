package b6_inheritance.baitap.point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed=0;
    private float ySpeed=0;

    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed,float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x, float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr={getxSpeed(),getySpeed()};
        return arr;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "Now is: "+Arrays.toString(getLocations())+"\n Speed: "+ Arrays.toString(getSpeed());
    }
    public Point move(){
        float newX=this.getX()+this.getxSpeed();
        float newY=this.getY()+this.getySpeed();
        this.setX(newX);
        this.setY(newY);
        return this;
    }
}

