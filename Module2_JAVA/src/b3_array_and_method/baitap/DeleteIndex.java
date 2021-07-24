package b3_array_and_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] preArr= {3,4,5,6,1,3,4};
        System.out.printf("Mang dau tien: %s \n", Arrays.toString(preArr));

        System.out.println("Nhap phan tu muon xoa: ");
        int value= scanner.nextInt();

        int index=-1;
        for(int j=0; j<preArr.length;j++) {
            if (preArr[j] == value) {
                index = j;
                break;
            }
        }
            if (index == -1) {
                System.out.printf("Ko co phan tu trong mang \n");
            } else {

                System.out.printf("Mang sau khi xoa la: %s", Arrays.toString(deleteArray(preArr, index)));
            }


    }
    public static int[] deleteArray(int[] arr,int index){
        int[] deletedArray=new int[arr.length-1];
        for(int i=0; i<arr.length;i++){
            if(i<index) {
                deletedArray[i] = arr[i];
            }
            if(i>index) {
                deletedArray[i-1] = arr[i];
            }
        }
        return deletedArray;
    }
}
