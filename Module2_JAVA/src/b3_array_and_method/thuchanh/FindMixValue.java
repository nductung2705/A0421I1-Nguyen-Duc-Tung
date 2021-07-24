package b3_array_and_method.thuchanh;

import java.util.Scanner;

public class FindMixValue {
    public static void main(String[] args) {
        int[] listNumber=inputArray();
        int min=findMin(listNumber);
        System.out.printf("The min value in array is: %d, o vi tri %d",listNumber[min],min);
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
    public  static int findMin(int[] arr){
        int min=0;;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
}
