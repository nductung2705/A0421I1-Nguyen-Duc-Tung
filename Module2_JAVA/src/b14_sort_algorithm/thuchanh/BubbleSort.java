package b14_sort_algorithm.thuchanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    static void bubbleSort(int[] numberList){
        boolean checkNext=true;
        for(int i=1; i<numberList.length&&checkNext;i++){
            checkNext=false;
            for (int j=0;j<numberList.length-i;j++){
                if(numberList[j]>numberList[j+1]){
                    int temp = numberList[j];
                    numberList[j]=numberList[j+1];
                    numberList[j+1]=temp;
                    checkNext=true;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] list=new int[10];
        for(int i=0;i<list.length;i++){
            list[i]= (int) (Math.random()*30);
        }
        System.out.println(Arrays.toString(list));
        System.out.println("After Sort---------");
        bubbleSort(list);
        System.out.println(Arrays.toString(list));

    }
}
