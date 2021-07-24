package b3_array_and_method.baitap;

import java.util.Scanner;

public class DiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chieu dai cua mang");
        int length=scanner.nextInt();

        int[][] matrix=InputMatrix(length);
        DisplayMatrix(matrix);

        SumTheMainDiagonal(matrix);


    }
    public static int[][] InputMatrix(int length){
        int[][] matrix=new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        return matrix;
    }
    public static void DisplayMatrix(int[][] matrix){
        System.out.println("Mang vua nhap la: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.printf("%-5d",matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static int SumTheMainDiagonal(int[][] matrix){
        int sum=0,scout=0;

        System.out.println("Cac phan tu cua duong cheo la: ");
        for (int i=0;i<matrix.length;i++){
            System.out.printf("%d \n",matrix[i][scout]);
            sum+=matrix[i][scout];
            scout++;
        }
        System.out.printf("\n Tong gia tri cua duong cheo chinh la: %d",sum);
        return sum;
    }
}
