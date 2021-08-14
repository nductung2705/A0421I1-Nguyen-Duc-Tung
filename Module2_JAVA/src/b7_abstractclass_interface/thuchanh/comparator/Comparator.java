package b7_abstractclass_interface.thuchanh.comparator;

public class Comparator implements java.util.Comparator<Rectangle> {
    @Override
    public int compare(Rectangle firstRec, Rectangle secondRec) {
        if(firstRec.getArea()>secondRec.getArea()){
            return 1;
        }
        else if(firstRec.getArea()<secondRec.getArea()){
            return -1;
        }
        else return 1;
    }
}
