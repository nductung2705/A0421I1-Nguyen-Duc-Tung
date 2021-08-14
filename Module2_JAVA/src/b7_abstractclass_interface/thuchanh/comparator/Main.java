package b7_abstractclass_interface.thuchanh.comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle[] recList=new Rectangle[3];
        recList[0]=new Rectangle(2,3);
        recList[1]=new Rectangle(1,3);
        recList[2]=new Rectangle(1.5,2);

        System.out.println("Pre-Sort-----");
        System.out.println(Arrays.toString(recList));

        System.out.println("After-Sort-----");
        Comparator newComparator=new Comparator();
        Arrays.sort(recList,newComparator);
        System.out.println(Arrays.toString(recList));
    }
}
