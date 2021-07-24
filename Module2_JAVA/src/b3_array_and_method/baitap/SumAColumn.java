package b3_array_and_method.baitap;

import java.util.Scanner;

public class SumAColumn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chieu cao cua mang");
        int height=scanner.nextInt();

        System.out.println("Nhap chieu dai cua mang");
        int length=scanner.nextInt();

        int[][] matrix=InputMatrix(height,length);
        DisplayMatrix(matrix,length);

        System.out.println("Nhap cot muon cong");
        int orderColumn=scanner.nextInt();

        SumAColumn(matrix,orderColumn);

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
    public static int SumAColumn(int[][] matrix, int col){
        int sum=0;
        System.out.println("Cac phan tu cua cot: ");
        for (int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][col]);
            sum+=matrix[i][col];
        }
        System.out.printf("\n Tong gia tri cua cot la: %d",sum);
        return sum;
    }
}
