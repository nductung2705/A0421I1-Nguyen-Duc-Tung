package b14_sort_algorithm.thuchanh;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort_StepbyStep {
        static void bubbleSort(int[] numberList){
            boolean checkNext=true;
            for(int i=1; i<numberList.length&&checkNext;i++){
                checkNext=false;
                for (int j=0;j<numberList.length-i;j++){
                    if(numberList[j]>numberList[j+1]){
                        System.out.println("Swap "+numberList[j]+ " to "+numberList[j+1]);
                        int temp = numberList[j];
                        numberList[j]=numberList[j+1];
                        numberList[j+1]=temp;
                        checkNext=true;
                    }
                }
                if(checkNext==false){
                    System.out.println("This step no sort");
                    break;
                }
                System.out.println(i + " time: ");
                System.out.println(Arrays.toString(numberList));
            }

        }

        public static void main(String[] args) {
            int[] list=new int[10];
            for(int i=0;i<list.length;i++){
                list[i]= (int) (Math.random()*30);
            }
            System.out.println(Arrays.toString(list));
            bubbleSort(list);

        }
    }
