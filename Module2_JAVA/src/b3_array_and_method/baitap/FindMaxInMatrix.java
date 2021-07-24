package b3_array_and_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chieu cao cua mang");
        int height=scanner.nextInt();

        System.out.println("Nhap chieu dai cua mang");
        int length=scanner.nextInt();

        int[][] matrix=InputMatrix(height,length);
        DisplayMatrix(matrix,length);

        FindMaxInMatrix(matrix,length);
    }

    public static int[][] InputMatrix(int height, int length){
        int[][] matrix=new int[height][length];
        for(int i=0;i<height;i++){
            for(int j=0;j<length;j++){
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        return matrix;
    }
    public static void DisplayMatrix(int[][] matrix, int length){
        System.out.println("Mang vua nhap la: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<length;j++){
                System.out.printf("%-5d",matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static int FindMaxInMatrix(int[][] matrix, int length){
        int max=matrix[0][0];
        int[] address=new int[2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                    address[0]=i;
                    address[1]=j;
                }
            }
        }
        System.out.printf("So lon nhat trong ma tran la: %d",max);
        System.out.printf("\n Nam o vi tri, %s", Arrays.toString(address));
        return max;
    }

}
