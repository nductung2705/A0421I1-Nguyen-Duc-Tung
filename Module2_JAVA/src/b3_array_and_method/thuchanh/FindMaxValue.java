package b3_array_and_method.thuchanh;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] listNumber=inputArray();
        int max=findMax(listNumber);
        System.out.printf("The Max value in array is: %d, o vi tri %d",listNumber[max],max);
    }
    public  static int[] inputArray(){
        Scanner scanner=new Scanner(System.in);
        int[] arr= new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Nhap phan tu thứ %d: ",i);
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public  static int findMax(int[] arr){
        int max=0;;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
