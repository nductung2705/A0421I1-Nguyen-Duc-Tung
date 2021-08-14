package b7_abstractclass_interface.thuchanh.comparable;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        this.radius=radius;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }
        else if (getRadius()<o.getRadius()){
            return -1;
        }
        else return 1;
    }
}
