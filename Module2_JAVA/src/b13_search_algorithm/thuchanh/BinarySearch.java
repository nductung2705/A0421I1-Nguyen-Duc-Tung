package b13_search_algorithm.thuchanh;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] list, int value){
        int left=0;
        int right=list.length-1;
        while (right>=left){
            int mid=(int) (right+left)/2;
            if(list[mid]==value){
                return mid;
            }
            else if(list[mid]<value){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] list=new int[10];

        for(int i=0;i<list.length;i++){
            System.out.println("Nhap gia tri "+i+" :");
            list[i]=scanner.nextInt();
        }
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,11));

    }
}
