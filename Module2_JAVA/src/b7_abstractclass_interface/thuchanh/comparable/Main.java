package b7_abstractclass_interface.thuchanh.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circlesList=new ComparableCircle[4];
        circlesList[0]=new ComparableCircle(2.5);
        circlesList[1]=new ComparableCircle(1);
        circlesList[2]=new ComparableCircle(5);
        circlesList[3]=new ComparableCircle(4);

        System.out.println("Pre-Arrays--------");
        System.out.println(Arrays.toString(circlesList));

        Arrays.sort(circlesList);
        System.out.println("After-Arrays--------");
        System.out.println(Arrays.toString(circlesList));
    }
}
