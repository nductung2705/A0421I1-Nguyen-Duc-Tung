package b3_array_and_method.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPassExam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chieu dai cua mang");
        int length=scanner.nextInt();

        int[] listStudent=InputMatrix(length);
        System.out.printf("Danh sach hoc sinh la: %s", Arrays.toString(listStudent));

        System.out.printf("\n Có %d học sinh đậu kì thi",CountStudentPass(listStudent));
    }
    public static int[] InputMatrix(int length){
        int[] matrix=new int[length];
        for(int i=0;i<length;i++) {
            matrix[i] = (int) (Math.random() * 10);
        }
        return matrix;
    }
    public static int CountStudentPass(int[] list){
        int count=0;
        for(int i=0;i<list.length;i++) {
           if(list[i]>=5){
               count++;
           }
        }
        return count;
    }
}
