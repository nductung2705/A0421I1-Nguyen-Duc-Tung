package b3_array_and_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndexToArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] preArr= {3,4,5,6,1,3,4};
        System.out.printf("Mang dau tien: %s \n", Arrays.toString(preArr));

        System.out.println("Nhap vi tri muon them: ");
        int index= scanner.nextInt();

        System.out.println("Nhap phan tu muon them: ");
        int value= scanner.nextInt();

        System.out.printf("Mang sau khi them la: %s", Arrays.toString(addItem(preArr,index,value)));
    }
    public static int[] addItem(int[] arr,int index, int value){
        int[] newArray=new int[arr.length+1];
        for(int i=0; i<newArray.length;i++){
            if(i<index){
                newArray[i]=arr[i];
                continue;
            }
            if (i==index){
                newArray[i]=value;
                continue;
            }
            if (i>index){
                newArray[i]=arr[i-1];
                continue;
            }

        }
        return newArray;
    }
}
