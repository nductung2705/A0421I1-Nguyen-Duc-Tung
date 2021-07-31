package b4_class_and_object.baitap.fan;

public class Fan {
    String name;
    String color;
    int speed;
    boolean isOn;
    double radius;

    public Fan(String name, String color,double radius  ){
        this.name=name;
        this.color=color;
        this.speed=0;
        this.isOn=false;
        this.radius=radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed=speed;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setStatus(boolean status) {
        this.isOn = status;
    }
    public void changStatus(){
        if(this.isOn){
            this.setStatus(false);
        }
        else {
            this.setStatus(true);
        }
    }
    public void changeSpeed(int number){
        if(this.isOn){
        int speed=this.getSpeed()+number;
        this.setSpeed(speed);
        }
        else {
            System.out.println("Thong bao: Vui long bat quat truoc de chinh toc do\n");
        }
    }
    public void showInfo(){

        String status="";
        String speed="";
        if(this.isOn()){
            status="On";
            switch (this.getSpeed()) {
                case 1: {
                    speed = "Slow";
                    break;
                }
                case 2: {
                    speed = "Medium";
                    break;
                }
                case 3: {
                    speed = "Fast";
                    break;
                }
                default:speed="No speed";
            }
        }
        else {
            status="Off";
            speed="No speed";
        }
        System.out.printf("Thong tin chiec quat:\n Ten: %s, ban kinh: %f, mau: %s \n Trang thai: %s, toc do: %s",this.getName(),this.getRadius(),this.getColor(),status,speed);
    }

}

