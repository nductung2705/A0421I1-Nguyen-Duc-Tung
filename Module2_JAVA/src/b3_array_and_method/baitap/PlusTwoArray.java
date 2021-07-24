package b3_array_and_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class PlusTwoArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Nhap do dai mang 1: \n");
        int lengthArr1=scanner.nextInt();

        int[] array1=new int[lengthArr1];
        InputArray(array1);

        System.out.printf("Nhap do dai mang 2: \n");
        int lengthArr2=scanner.nextInt();
        int[] array2=new int[lengthArr2];
        InputArray(array2);

        System.out.printf("Tong 2 mang la: %s", Arrays.toString(PlusArray(array1,array2)));
    }
    public  static int[] InputArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            arr[i]=(int) (Math.random()*10);
        }
        System.out.printf("Mang vua nhap la: %s \n", Arrays.toString(arr));
        return arr;

    }
    public static int[] PlusArray(int[] arr1, int[] arr2){
        int[] sumArray=new int[arr1.length+arr2.length];
        int scout=0;
        for (int i=0;i<sumArray.length;i++){
            if(i<arr1.length){
                sumArray[i]=arr1[i];
            }
            else {
                sumArray[i] = arr2[scout];
                scout++;
            }
        }
        return sumArray;
    }
}
