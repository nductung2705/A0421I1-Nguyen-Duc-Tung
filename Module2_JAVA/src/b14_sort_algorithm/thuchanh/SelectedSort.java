package b14_sort_algorithm.thuchanh;

import java.util.Arrays;

public class SelectedSort {
    static void selectSort(int[] numberList){
        for(int i=0; i<numberList.length;i++){
            int minIndex=i;
            int minValue=numberList[i];
            for(int j=i+1;j<numberList.length;j++){
                if(numberList[minIndex]>numberList[j]){
                    minIndex=j;
                    minValue=numberList[j];
                }
            }
            if(minIndex!=i){
                System.out.println("Swap "+numberList[i] + " with "+minValue);
                numberList[minIndex]=numberList[i];
                numberList[i]=minValue;
            }
        }
    }

    public static void main(String[] args) {
        int[] numberList=new int[10];
        for(int i=0;i<numberList.length;i++){
            numberList[i]= (int) (Math.random()*30);
        }
        System.out.println(Arrays.toString(numberList));
        System.out.println("After Sort---------");
        selectSort(numberList);
        System.out.println(Arrays.toString(numberList));
    }
}
