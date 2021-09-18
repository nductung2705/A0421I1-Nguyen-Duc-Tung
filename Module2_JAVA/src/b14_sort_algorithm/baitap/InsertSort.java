package b14_sort_algorithm.baitap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    static void insertSort(int[] numberList){
        int min;
        int index=0;
        for(int i=1;i<numberList.length;i++){
            min=numberList[i];
            index=i-1;
             while (index>=0&&numberList[index]>min){
                 numberList[index+1]=numberList[index];
                 index--;
             }
             numberList[index+1]=min;
        }

    }

    public static void main(String[] args) {
        int[] list= {3, 2, 1};
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }

}
