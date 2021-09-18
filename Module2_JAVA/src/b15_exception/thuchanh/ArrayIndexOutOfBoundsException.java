package b15_exception.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] listNumber = new int[100];
        for (int i = 0; i < listNumber.length; i++) {
            listNumber[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(listNumber));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap index can tim gia tri: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Gia tri cua index " + index + " la: " + listNumber[index]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.err.println("Gia tri ko hop le");
        }
    }
}
