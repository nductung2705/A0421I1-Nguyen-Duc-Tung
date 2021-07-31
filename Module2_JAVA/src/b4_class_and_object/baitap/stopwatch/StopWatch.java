package b4_class_and_object.baitap.stopwatch;

public class StopWatch {
    double starTime;
    double endTime;

    public double getStarTime() {
        return starTime;
    }

    public void setStarTime(double starTime) {
        this.starTime = starTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
    public void start(){
        double startTime=System.currentTimeMillis();
        this.setStarTime(startTime);
    }
    public void end(){
        double endTime=System.currentTimeMillis();
        setEndTime(endTime);
    }
    public double getProgressTime(){
        double loadingTime=this.getEndTime()-this.getStarTime();
        return loadingTime;
    }
}
