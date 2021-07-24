package b3_array_and_method.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrLength = 0;

        do {
            System.out.printf("Nhap do dai cua mang: ");
            arrLength=scanner.nextInt();
        } while (arrLength<=0||arrLength>20);

        int[] arr= new int[arrLength];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Nhap phan tu thứ %d: ",i);
            arr[i]=scanner.nextInt();
        }
        System.out.printf("Mang phan dau la %s", Arrays.toString(arr));

        int[] reverseArr= reverseArray(arr);
        System.out.printf("\nMang dao nguoc la %s", Arrays.toString(reverseArr));
    }
    public static int[] reverseArray(int[] arr){
        int[] reverserArr= new int[arr.length];
        int last = arr.length-1;
        for(int i = 0; i < arr.length;i++){
            reverserArr[last]=arr[i];
            last--;
        }
        return reverserArr;
    }

}
